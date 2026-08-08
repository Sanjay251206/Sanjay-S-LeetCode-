class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> array = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                array.add(count);
                count = 1;
            }
        }
        array.add(count);
        HashSet<Integer> set = new HashSet<>(array);
        return set.size() == array.size();
    }
}