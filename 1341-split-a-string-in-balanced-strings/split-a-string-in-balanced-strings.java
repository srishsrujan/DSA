class Solution {
    public int balancedStringSplit(String s) {
        int len=s.length();
        int l=0,r=0,b=0;
        for(int i=0;i<len;i++){
            
            char ch=s.charAt(i);
            
            if(ch=='R')
            r++;
            else
            l++;

            if(l==r)
            b++;
            
        }
        return b;
    }
}