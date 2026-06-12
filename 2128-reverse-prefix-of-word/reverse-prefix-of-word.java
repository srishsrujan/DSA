class Solution {
    public String reverse(String s){
        int l=s.length();
        String str="";
        for(int i=l-1;i>=0;i--){
            char ch =s.charAt(i);
            str=str+ch;
        }
        return str;
    }
    public String reversePrefix(String word, char ch) {
        int flag=0;
        int index=-1;
        int l=word.length();
        String s="";
        Solution sol=new Solution();
        for(int i=0;i<l;i++){
            char c=word.charAt(i);
            s=s+c;
            if(c==ch){
                flag=1;
                index=i;
                break;
            }
        }
        String ans="";
        if(flag==1){
            ans=sol.reverse(s);
            for(int i=index+1;i<l;i++)
            ans=ans+word.charAt(i);
            return ans;
        }
        else{
            return s;
        }
    }
}