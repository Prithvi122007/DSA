class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0;
        int num=x;
        while(num!=0){
            rev = num%10 + rev*10;
            num/=10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}