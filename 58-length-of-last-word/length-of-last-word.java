class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int l=s.length();
        int c=0;
        for(int i=l-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=32)
            c++;
            else
            break;
        }
        return c;
    }
}