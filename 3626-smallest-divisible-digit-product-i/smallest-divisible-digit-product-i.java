class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
       int temp=n;
       int mul=1;
        while(temp!=0){
            int te=temp%10;
            mul*=te;
            temp/=10;
        }
        if(mul % t==0){
            return n;
        }
        else{
           n= nextelement(n);
        }
        }
    }
    public int nextelement(int n){
        return n+1;
    }
}
