class Solution {
    public int minElement(int[] nums) {
        int l= nums.length;
        for(int i=0;i<l;i++){
            int temp=nums[i];
            int sum=0,rem;
            while(temp!=0){
                rem=temp%10;
                temp=temp/10;
                sum=sum+rem;
            }
            nums[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l;i++){
            if(nums[i]<min)
            min=nums[i];
        }
        return min;
    }
}