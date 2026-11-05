class Solution {
    public boolean isPowerOfFour(int n) {
        int num = n;
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%4==0){
            double t=0;
            double c=0;
            while(n>3){
                n = n/4;
                c++;
            }
            double res = Math.pow(4,c);
            if(res==num){
                return true;
            }
            return false;
        }
        return false;
    }
}