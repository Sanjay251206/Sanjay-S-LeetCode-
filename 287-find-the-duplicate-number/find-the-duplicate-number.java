class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>arr=new HashSet<>();
            for(int num:nums){
                if(arr.contains(num)){
                    return num;
                }
                arr.add(num);
            }
    return -1;
    }
}