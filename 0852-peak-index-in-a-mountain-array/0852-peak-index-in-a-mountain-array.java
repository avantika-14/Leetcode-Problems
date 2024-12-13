class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int c = 0, r = arr.length - 1, m;
        while (c < r) {
            m = c + (r - c)/2;
            if (arr[m] < arr[m + 1])
                c = m + 1;
            else
                r = m;
        }
        return c;
    }
}