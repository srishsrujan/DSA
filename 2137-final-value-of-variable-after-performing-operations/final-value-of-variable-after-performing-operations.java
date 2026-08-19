class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if((operations[i].substring(0,2)).equals("++")||(operations[i].substring(1)).equals("++"))
            ++x;
            else if((operations[i].substring(0,2)).equals("--")||(operations[i].substring(1)).equals("--"))
            --x;
        }
        return x;
    }
}