class Solution {
    public List<Integer> rows(int n){
        int ans=1;
        List<Integer> res=new ArrayList<>();
        res.add(ans);
        for(int i=1;i<n;i++){
            ans*=(n-i);
            ans/=i;
            res.add(ans);
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int r=1;r<=numRows;r++)
            ans.add(rows(r));
        return ans;
    }
}