class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        int sums[]=new int[l];
        int temp=0;
        for(int i=0;i<l;i++){
            temp+=nums[i];
            sums[i]=temp;
        }
        return sums;
    }
}