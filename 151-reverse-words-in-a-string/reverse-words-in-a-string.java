class Solution {
    public String reverseWords(String s) {
        String[] split=s.trim().split("\\s+");
        ArrayList<String>str=new ArrayList<>();
        for(int i=split.length-1;i>=0;i--){
            str.add(split[i]);
        }
        return String.join(" ",str);
    }
}