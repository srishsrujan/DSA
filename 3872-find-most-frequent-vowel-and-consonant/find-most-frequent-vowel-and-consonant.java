class Solution {
    public int maxFreqSum(String s) {

        int vow[]= new int[26];
        int cons[]= new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow[ch-'a']++;
            }
            else{
                cons[ch-'a']++;
            }
        }

        int maxV=0;
        int maxC=0;

        for(int i=0;i<26;i++){
            if(maxV<vow[i])
                maxV=vow[i];
        }
        for(int i=0;i<26;i++){
            if(maxC<cons[i])
                maxC=cons[i];
        }

        return maxV+maxC;
    }
}