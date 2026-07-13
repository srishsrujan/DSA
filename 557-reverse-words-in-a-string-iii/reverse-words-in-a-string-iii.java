class Solution {
    public String reverseWords(String s) {
        s=" "+s;
        int l=s.length();
        String str="";
        String ans="";
        for(int i=l-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=32){
            str=str+ch;
            }
            if(ch==32){
                ans=" "+str+ans;
                str="";
            }
        }
        return ans.trim();
    }
}