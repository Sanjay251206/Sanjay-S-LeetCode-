class Solution {
    public boolean isAnagram(String s, String t) {
    int count[]=new int[26];
    for(char c:s.toCharArray()){
        count[c-'a']++;
    }
    for(char d:t.toCharArray()){
        count[d-'a']--;
    }
    for(int i=0;i<26;i++){
        if(count[i]!=0){
            return false;
        }
    }
    return true;
    }
}