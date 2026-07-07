class Solution {
    public long sumAndMultiply(int n) {
        long sum=0,mul=0,r,x=0;
        while(n!=0){
            r=n%10;
            n=n/10;
            if(r!=0){
                sum+=((int)r*Math.pow(10,x));
                mul=mul+r;
                x++;
            }
        }
        return sum*mul;
    }
}