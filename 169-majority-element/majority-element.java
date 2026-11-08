class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(c == 0){
                max = nums[i];
            }

            if(nums[i] == max){
                c++;
            }
            else{
                c--;
            }
        }

        return max;
    }
}