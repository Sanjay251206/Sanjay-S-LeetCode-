class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            int g = 0;
            long l = 1;

            for (int j = i; j < n; j++) {
                int val = nums[j];
                prod *= val;
                g = (g == 0) ? val : gcd(g, val);
                l = lcm(l, val);

                if (prod == l * g) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private long lcm(long a, long b) {
        return (a / gcd((int) a, (int) b)) * b;
    }
}