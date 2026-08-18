class Solution {
    public int[] twoSum(int[] num, int tar) {
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==tar){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
}