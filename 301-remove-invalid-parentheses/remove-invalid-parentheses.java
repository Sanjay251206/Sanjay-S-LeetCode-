class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String> result = new HashSet<>();
        int extraLeft = 0, extraRight = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                extraLeft++;
            } else if (c == ')') {
                if (extraLeft > 0) extraLeft--;
                else extraRight++;
            }
        }
        backtrack(s, 0, extraLeft, extraRight, result);
        return new ArrayList<>(result);
    }
    private void backtrack(String s, int index, int leftCount, int rightCount, Set<String> result) {

        if (leftCount == 0 && rightCount == 0) {
            if (isValid(s)) {
                result.add(s);
            }
            return;
        }
        
        for (int i = index; i < s.length(); i++) {
            if (i != index && s.charAt(i) == s.charAt(i - 1)) continue;
            
            char c = s.charAt(i);
            String nextStr = s.substring(0, i) + s.substring(i + 1);
            
            if (leftCount > 0 && c == '(') {
                backtrack(nextStr, i, leftCount - 1, rightCount, result);
            }
            if (rightCount > 0 && c == ')') {
                backtrack(nextStr, i, leftCount, rightCount - 1, result);
            }
        }
    }
        private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else if (c == ')') count--;
            if (count < 0) return false;
        }
        return count == 0;
    }
}