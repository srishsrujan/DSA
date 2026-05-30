class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            int  flag=1;
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (allowed.indexOf(ch) == -1) {   
                   flag =0;
                    break;
                }
            }
            if (flag==1)
                c++;
        }
        return c;
    }
}