class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0, l=pref.length();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()>=l)
            {
                String s= words[i].substring(0,l);
                if(s.equals(pref))
                    c++;
            }
        }
        return c;
    }
}