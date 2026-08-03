class Solution {
    public boolean canAliceWin(int[] nums) {
        Arrays.sort(nums);
        int sumsingle=0,sumdouble=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9)
            sumsingle+=nums[i];
            else
            sumdouble+=nums[i];
        }
        if(sumsingle>sumdouble||sumsingle<sumdouble)
        return true;
        else 
        return false;
    }
}