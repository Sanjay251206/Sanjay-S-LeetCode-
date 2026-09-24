class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int temp1=nums[i];
            while(temp1>0){
                int temp2=temp1%10;
                sum+=temp2;
                temp1/=10;
            }
          if(sum==i){
            return i;
          }
        }
        return -1;
    }
}