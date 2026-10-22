class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        int idx0 = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                idx0 = i;
                break;
            }
        }

        boolean inc = true;
        for (int i = 0; i < n; i++) {
            if (nums[(i + 1) % n] != (nums[i] + 1) % n) {
                inc = false;
                break;
            }
        }

        if (inc) {
            if (idx0 == 0) return 0;
           
            return Math.min(idx0, 2 + (n - idx0));
        }

        boolean dec = true;
        for (int i = 0; i < n; i++) {
            if (nums[(i + 1) % n] != (nums[i] - 1 + n) % n) {
                dec = false;
                break;
            }
        }

        if (dec) {
          
            int cost1 = 1 + (n - 1 - idx0);

            int cost2 = ((idx0 + 1) % n) + 1;

            return Math.min(cost1, cost2);
        }

        return -1;
    }
}