class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum =0;
        int s =0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>s){
            s = sum;
            }
            sum=0;
        }
        
    return s;
    }
    
}
