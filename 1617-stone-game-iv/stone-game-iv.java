class Solution {
    boolean stone[]=new boolean[100001];
    public boolean winnerSquareGame(int n) {
        if(n==0){
            return false;
        }
            if(stone[n]){
                return stone[n];
            }
            for(int i=1;i*i<=n;i++){
                if(winnerSquareGame(n-i*i)==false){
                    return stone[n]=true;
                }
            }
            return stone[n]=false;
        
    }
}