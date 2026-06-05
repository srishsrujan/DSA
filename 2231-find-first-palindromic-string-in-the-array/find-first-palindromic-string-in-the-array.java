class Solution{
    public boolean isPal(String s){
        String str="";
        int l=s.length();
        for(int i=l-1;i>=0;i--){
            char ch=s.charAt(i);
            str=str+ch; 
        }
        if(str.equals(s)){
            return true;
            }
        else{
            return false;
            }  
    } 
    public String firstPalindrome(String[] words) {
        int l=words.length;
        for(int i=0;i<l;i++){
            if(isPal(words[i]))
            return words[i];
        }
        return "";
    }
}