class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);     //greed factor
        Arrays.sort(s);     //size of the array
        int m=g.length;
        int n=s.length;
        int cookie=0,child=0;
        while(child<m && cookie<n)
        {
            if(g[child]<=s[cookie])
            {
                child++;
            }
            cookie++;
        }
        return child;
    }
}