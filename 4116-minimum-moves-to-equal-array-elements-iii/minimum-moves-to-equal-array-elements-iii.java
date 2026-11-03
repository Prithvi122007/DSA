class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int c=0;
        int sum;
        int total=0;
        while(c!=nums.length){
            sum = max - nums[c];
            total+=sum;
            c++;
        }
        return total;
    }
}