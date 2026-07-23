class Solution {
    public int minimumSum(int num) {
       int arr[]=new int[4];
       arr[0]=num%10;
       num/=10;
       arr[1]=num%10;
       num/=10;
       arr[2]=num%10;
       num/=10;
       arr[3]=num;
       Arrays.sort(arr);
       return(10*arr[0]+arr[2])+(10*arr[1]+arr[3]);
    }
}