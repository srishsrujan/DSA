class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int m1=nums[l-1];
        int m2=nums[l-2];
        return (m1-1)*(m2-1);
    }
}