class Solution {
    public List<List<Integer>> generate(int numrow) {
        List<List<Integer>>pascal=new ArrayList<>();
        for(int i=0;i<numrow;i++){
            List<Integer>num=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    num.add(1);
                }
                else{
                    List<Integer>prev=pascal.get(i-1);
                    num.add(prev.get(j)+prev.get(j-1));
                }
            }
            pascal.add(num);
        }
        return pascal;
    }
}