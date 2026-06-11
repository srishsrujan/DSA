class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int l = nums.length;
        int n[] = new int[l];
        int c = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] < pivot) 
            n[c++] = nums[i];
        }
        for (int i = 0; i < l; i++) {
            if (nums[i] == pivot) 
            n[c++] = nums[i];
        }
        for (int i = 0; i < l; i++) {
            if (nums[i] > pivot) 
            n[c++] = nums[i];
        }
        return n;
    }
}