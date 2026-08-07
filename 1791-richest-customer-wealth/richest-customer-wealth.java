class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        int richest=0;
        int m=accounts.length;
        
        for(int i=0;i<m;i++){
            int n=accounts[i].length;
            for(int j=0;j<n;j++){
                wealth+=accounts[i][j];
            }
            richest=Math.max(richest,wealth);
            wealth =0;
        }
        
        return richest;
    }
}