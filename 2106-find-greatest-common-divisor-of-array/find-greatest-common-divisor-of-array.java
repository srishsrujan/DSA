class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        
        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        while (b != a) {
            if (b >= a) b -= a;
            else a -= b;
        }
        return a;  
    }
}