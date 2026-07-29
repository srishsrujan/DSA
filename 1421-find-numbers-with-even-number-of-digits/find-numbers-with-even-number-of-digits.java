class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int x=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                sum++;
            }
            if(sum%2==0)
            x++;
        }
        return x;
    }
}