class Solution {
    public int numberOfSpecialChars(String word) {
       int n = word.length();
        
        boolean upper[] = new boolean[26];
        boolean lower[] = new boolean[26];

        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = true;
            } 
            else {
                upper[ch - 'A'] = true;
            }
        }

        int c = 0;

        for (int i = 0; i < 26; i++) {
            if (upper[i] && lower[i]) {
                c++;
            }
        }

        return c;  
    }
}