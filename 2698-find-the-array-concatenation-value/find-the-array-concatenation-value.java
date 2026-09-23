class Solution {
    public long findTheArrayConcVal(int[] nums) {
       long sum=0;
       int i=0;
       int j=nums.length-1;
       while(j>=i){
        if(i==j){
            sum+=nums[i];
        }
        else{
            sum+=Long.parseLong(nums[i]+""+nums[j]);
        }
        i++;
        j--;
       }
       return sum;
    }
}