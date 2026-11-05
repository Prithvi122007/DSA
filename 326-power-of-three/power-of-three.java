class Solution {
    public boolean isPowerOfThree(int n) {
        int num = n;
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        double c=0;
        while(n>2){
            n = n/3;
            c++;
        }
        double res = Math.pow(3,c);
        if(res==num){
            return true;
        }
        return false;
    }
}