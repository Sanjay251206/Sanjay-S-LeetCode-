class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int num = 0;
        for (int i = 0; i < words.length; i++) {
            boolean con = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                    con = false;
                    break;
                }
            }
            if (con) {
                num++;
            }
        }
        return num;
    }
}