class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar=prices[0];
        int res=0;
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
            minSoFar=Math.min(minSoFar,prices[i]);
            res=Math.max(res,prices[i]-minSoFar);
        }
        return res;
    }
}