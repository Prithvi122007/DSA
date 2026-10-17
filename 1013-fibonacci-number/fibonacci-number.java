class Solution {
    public int fib(int n) {
        int m=0;
        if(n <= 0){
            return m;
        }
        else if(n==1 || n==2){
            return m+1;
        }
        int fib = fib(n-1) + fib(n-2);
        return fib;
    }
}