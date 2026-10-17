class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        
        int[][] arr = new int[n][3];
        
        for (int i = 0; i < n; i++) {
            int sum = 0, temp = nums[i];
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            arr[i] = new int[]{sum, nums[i], i};
        }
         Arrays.sort(arr, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        int swaps = 0;
        boolean[] visited = new boolean[n];        
        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][2] == i) {
                continue;
            }
            int cycleLength = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][2]; 
                cycleLength++;
            }
            
            swaps += (cycleLength - 1);
        }
        
        return swaps;
    }
}