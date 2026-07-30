class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int n = g.length;
        int m = s.length;

        int l = 0;
        int r = 0;
        int count = 0;

        if (s.length == 0) return 0;

        while( l < m ){
            if(r == g.length) break;

            if(s[l] >= g[r]){
                count++;
                r++;
                l++;
            }
            else{
                l++;
            }
            
        }
        return count;
    }
}