class Solution{
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] != 0){
                prod *= nums[i];

            }else{
                count++;
            }
        }
        
}