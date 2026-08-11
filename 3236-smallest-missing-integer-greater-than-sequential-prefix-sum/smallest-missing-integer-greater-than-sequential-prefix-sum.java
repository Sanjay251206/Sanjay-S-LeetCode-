class Solution {
    public int missingInteger(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(nums[0]);
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1]+1){
                arr.add(nums[j]);
            }
            else{
                break;
            }
        }
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int small=sum;
        while(true){
            boolean found=false;
            for(int num:nums){
                if(num==small){
                    found=true;
                    break;
                }
            }
            if(!found){
                return small;
            }
            small++;
        }
    }
}