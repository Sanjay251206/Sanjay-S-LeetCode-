class Solution {
    public int maxFreqSum(String s) {
        ArrayList<Character>vow=new ArrayList<>();
        ArrayList<Character>con=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow.add(ch);
            }
            else{
                con.add(ch);
            }
        }
        int maxvow=0;
        int maxcon=0;
        for(char ch:vow){
            int count=Collections.frequency(vow,ch);
            maxvow=Math.max(maxvow,count);
        }
        for(char ch:con){
            int count=Collections.frequency(con,ch);
            maxcon=Math.max(maxcon,count);
        }
        return maxvow+maxcon;
        
    }
}