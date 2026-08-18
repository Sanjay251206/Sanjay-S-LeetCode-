class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> arr = new ArrayList<>();
        if (nums.length == 0) {
            return arr;
        }
        int start = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
            } else {
                if (start == nums[i]) {
                    arr.add("" + start);
                } else {
                    arr.add(start + "->" + nums[i]);
                }
                start = nums[i + 1];
            }
        }
        if (start == nums[nums.length - 1]) {
            arr.add("" + start);
        } else {
            arr.add(start + "->" + nums[nums.length - 1]);
        }
        return arr;
    }
}