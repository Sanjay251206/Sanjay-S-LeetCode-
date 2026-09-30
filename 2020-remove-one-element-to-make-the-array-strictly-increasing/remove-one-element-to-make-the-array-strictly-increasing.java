class Solution {
    public boolean canBeIncreasing(int[] nums) {
         for (int del = 0; del < nums.length; del++) {
            boolean inc = true;
            int prev = -1;
            for (int i = 0; i < nums.length; i++) {
                if (i == del)
                    continue;
                if (prev >= nums[i]) {
                    inc = false;
                    break;
                }
                prev = nums[i];
            }
            if (inc)
                return true;
        }
        return false;
    }
}