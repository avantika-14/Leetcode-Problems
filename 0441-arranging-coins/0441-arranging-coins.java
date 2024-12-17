class Solution {
    public int arrangeCoins(int n) {
        if (n <= 1) 
            return n;
        if (n <= 3) 
            return n == 3 ? 2 : 1;
        int start = 0;
        int end = n;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long coinsUsed = mid * (mid + 1) / 2;
            if (coinsUsed == n)
                return (int)mid;
            if (n < coinsUsed)
                end = (int)mid - 1;
            else
                start = (int)mid + 1;
        }
        return (int)end;
    }
}