class Solution {
    public String removeOccurrences(String s, String part) {
     /*   int flag=0;
        String str=s.replace(part,"");
        while(flag==0){
            str=s.replace(part,"");
            if(s.compareTo(str)!=0)
            flag=0;
            else
            flag=1;
        }
        return str;*/
        int index = s.indexOf(part);
        while(index != -1) {
            s = s.substring(0, index) + s.substring(index + part.length());
            index = s.indexOf(part);
        }
        return s;
    }
}