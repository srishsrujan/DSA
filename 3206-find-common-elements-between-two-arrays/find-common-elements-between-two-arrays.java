class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int left=0,right=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                left++;
                break;
                }
            }
        }
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums1[j]==nums2[i]){
                right++;
                break;
                }
            }
        }
        int n[]={left,right};
        return n;
    }
}