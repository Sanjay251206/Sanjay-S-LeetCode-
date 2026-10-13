class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        java.util.Arrays.sort(squares);
        long maxScore = 0;
        for (int i = 0; i < n / 2; i++) {
            maxScore -= squares[i];
        }
        for (int i = n / 2; i < n; i++) {
            maxScore += squares[i];
        }
        return maxScore;
    }
}