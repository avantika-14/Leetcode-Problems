class Solution {
    public void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int id=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                id=i;
                break;
            }
        }
        if(id==-1) reverse(nums,0,n-1);
        else{
            for(int i=n-1;i>=id;i--){
                if(nums[i]>nums[id]){
                    swap(nums,i,id);
                    break;
                }
            }
            reverse(nums,id+1,n-1);
        }
    }
}