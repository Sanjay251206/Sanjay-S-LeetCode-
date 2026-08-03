class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>arr=new ArrayList<>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int j=0;j<candies.length;j++){
            if(max<=candies[j]+extraCandies){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}