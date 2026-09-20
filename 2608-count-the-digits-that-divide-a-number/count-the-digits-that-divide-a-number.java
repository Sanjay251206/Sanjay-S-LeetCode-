class Solution {
    public int countDigits(int num) {
        int temp=num;
        int count=0;
        while(num>0){
            int r=num%10;
            if(temp%r==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}