class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            boolean f = false;
            for(int k=0;k<nums.length;k++){
                if(nums[k]==i){
                    f=true;
                    break;
                }
            }
                if(!f){
                    arr.add(i);
                }
            }
        return arr;
    }
}