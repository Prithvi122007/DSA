class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;

        for(int i = 0; i<nums.length;i++){
            if(nums[i]==val){
                c++;
            }
        }
        int k = nums.length-c;
        for(int i = 0 ; i < k; i++){
            for(int j = nums.length-1 ; j > i ;j--){
                if(nums[i]==val){
                    if(nums[j]!=val){  
                        int temp = nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;;
                    }
                }
            }
        }
        return k;
    }
}