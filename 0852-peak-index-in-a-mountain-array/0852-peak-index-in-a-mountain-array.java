class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1, mid;
        while (start < end) {
            mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1])
                //descending part of the array
                //may be the answer, hence mid -1, check left
                end = mid;
            else
                //ascending part of the array
                start = mid + 1; //mid + 1 > mid
        }
        //in the end start = end
        return start;
    }
}