class Solution {
    public int numberOfSteps(int num) {
        int x=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
                x++;
            }
            else{
                num--;
                x++;
            }
        }
        return x;
    }
}