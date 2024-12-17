class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]); //at the end of the loop this will contatin max value of the array
            end += nums[i];
        }
        if (k == 1) 
		    return (int)end;
        while(start < end){
            int mid = start + (end - start)/2;
            int sum = 0; //the sum of elements in the specific subarray
            int count = 1;
            for(int num:nums){
                if(sum + num > mid){
                    sum = num;
                    count ++;
                }
                else
                    sum += num;
            }
            if(count <= k)
                end = mid;
            else
                start = mid + 1;
        }
        return end; // here start == end
    }
}