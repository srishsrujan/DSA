class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int maxi=0;
        for(int i=0;i<gain.length;i++){
            alt=alt+gain[i];
            maxi=Math.max(maxi,alt);
        }
        return maxi;
    }
}