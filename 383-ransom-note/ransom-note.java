class Solution {
    public boolean canConstruct(String ranso, String magazine) {
        boolean[]use=new boolean[magazine.length()];
        for(int i=0;i<ranso.length();i++){
            boolean found=false;
            for(int j=0;j<magazine.length();j++){
                if(ranso.charAt(i)==magazine.charAt(j)&& !use[j]){
                    use[j]=true;
                    found=true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}