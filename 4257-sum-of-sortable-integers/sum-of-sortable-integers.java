class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int[] prefMax = new int[n];
        int[] suffMin = new int[n];

        prefMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefMax[i] = Math.max(prefMax[i - 1], nums[i]);
        }

        suffMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffMin[i] = Math.min(suffMin[i + 1], nums[i]);
        }

        int totalSum = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;

            if (isSortable(nums, sorted, prefMax, suffMin, n, k)) {
                totalSum += k;
            }
        }

        return totalSum;
    }

    private boolean isSortable(int[] nums, int[] sorted, int[] prefMax, int[] suffMin, int n, int k) {
        for (int start = 0; start < n; start += k) {
            int end = start + k - 1;
            if (end + 1 < n && prefMax[end] > suffMin[end + 1]) {
                return false;
            }
            int dropCount = 0;
            int dropIdx = -1;
            for (int i = start; i < end; i++) {
                if (nums[i] > nums[i + 1]) {
                    dropCount++;
                    dropIdx = i;
                }
            }
            if (nums[end] > nums[start]) {
                dropCount++;
                dropIdx = end;
            }
            if (dropCount > 1) {
                return false;
            }
            int rotStart = (dropCount == 0) ? start : (dropIdx == end ? start : dropIdx + 1);

            for (int i = 0; i < k; i++) {
                int actualVal = nums[start + (rotStart - start + i) % k];
                if (actualVal != sorted[start + i]) {
                    return false;
                }
            }
        }

        return true;
    }
}