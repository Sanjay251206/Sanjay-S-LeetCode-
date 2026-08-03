class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int c=0;
        for(int i=0;i<gain.length;i++){
            c+=gain[i];
            max=Math.max(max,c);
        } 
        return max;
        
    }
}