class Solution {
    public String convertDateToBinary(String date) {
        String s1=date.substring(0,4);
        String s2=date.substring(5,7);
        String s3=date.substring(8,10);
        int n1=Integer.valueOf(s1);
        int n2=Integer.valueOf(s2);
        int n3=Integer.valueOf(s3);
        String s="";
        while(n3!=0){
            if(n3%2==0)
            s="0"+s;
            else
            s="1"+s;
            n3/=2;
        }
        s="-"+s;
        while(n2!=0){
            if(n2%2==0)
            s="0"+s;
            else
            s="1"+s;
            n2/=2;
        }
        s="-"+s;
        while(n1!=0){
            if(n1%2==0)
            s="0"+s;
            else
            s="1"+s;
            n1/=2;
        }
        
    return s;
    }
}