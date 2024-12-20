class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) //the array is not rotated
            return binarySearch(nums, target, 0, nums.length - 1);
        //pivot is found, there are 2 ascending arrays
        if (nums[pivot] == target)
            return pivot;
        //cases
        if (target >= nums[0])
            return binarySearch(nums, target, 0, pivot -1);
        else 
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            //cases
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (start < mid && nums[mid] < nums[mid - 1])
                return mid - 1;
            if(nums[start] >= nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else 
                return mid;
        }
        return -1;
    }
}