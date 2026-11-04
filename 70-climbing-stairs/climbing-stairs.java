class Solution {
    public int climbStairs(int n) {
        int first = 0;
        int sec = 1;
        int sum = 0 ;
        if(n<=1){
            return 1;
        }
        for(int i = 0; i < n ; i++){
            sum = first + sec;
            first = sec;
            sec = sum;
        }
        return sum;
    }
}