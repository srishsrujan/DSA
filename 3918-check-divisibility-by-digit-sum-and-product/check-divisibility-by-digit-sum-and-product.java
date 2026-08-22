class Solution {
    public boolean checkDivisibility(int n) {
       int x=n;
       int sum=0,prod=1;
       while(x>0){
        sum+=x%10;
        prod*=x%10;
        x/=10;
       } 
       if(n%(sum+prod)==0)
       return true;
       else
       return false;
    }
}