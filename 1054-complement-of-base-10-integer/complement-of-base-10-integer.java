class Solution {
    public int bitwiseComplement(int n) {
        String str="";
        if(n==0)
        return 1;
        while(n!=0){
            if((n&1)==1)
            str="0"+str;
            else 
            str="1"+str;
            n=n>>1;
        }
        int deci = Integer.parseInt(str, 2);
        return deci;
    }
}