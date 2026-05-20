class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        String str="";
        String str1="";
        int l=s.length();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch!=32)
            str1=str1+ch;
            else{
                str=str1+" "+str;
                str1="";
                if(str.charAt(0)==32)
                str=str.substring(1);
            }

        }
        return str.trim();
    }
}