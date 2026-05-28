class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] output = new int[friends.length];
        int c = 0;
        for(int i = 0; i < order.length; i++){
            for(int j = 0; j < friends.length; j++){
                if(order[i] == friends[j]){
                    output[c++] = order[i];
                    break;
                }
            }            
        }

        return output;
    }
}