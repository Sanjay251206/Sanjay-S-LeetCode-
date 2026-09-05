class Solution {
    public boolean checkRecord(String s) {
        int a=0,l=0;
        for(char ch:s.toCharArray()){
            if(ch=='A'){
                ++a;
                l=0;
                }
            else if(ch=='L'){
               ++l;
            } 
            else{ 
                l=0;
                }
            if(a>=2||l>=3) return false;
        }
        return true;
        }
}