class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<31;i++){
            long num=(long)Math.pow(2,i);
            if(num==n)
            return true;
            if(num>n)break;
        }
        return false;
    }
}