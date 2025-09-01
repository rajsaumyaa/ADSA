//with using division operator
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int ans[] = new int[n];
        int prod = 1;
        int count = 0;


        for (int i = 0; i<n; i++){
            if(nums[i] == 0){
                count++;
            }else{
                prod *= nums[i];

            }
        }
       
        for(int i =0; i<n; i++){
            if(count > 1){
                ans[i] = 0;
            } else if(count == 1){
                if(nums[i] == 0){
                ans[i] = prod;
                }else{
                    ans[i] = 0;
                }
            }else{
            ans[i] = prod / nums[i];
            }
        }
        return ans;

    }
}
// Time Complexity: O(N) where N is the number of elements in the input array.
// Space Complexity: O(1) if we don't count the output array, otherwise O(N) for the output array.

//without using division operator
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int ans[] = new int[n];

        ans[0] = 1;
        for(int i =1; i <n; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int suff = 1;
        for(int i = n-1; i>=0; i--){
            ans[i] *= suff;
            suff *= nums[i];
        }
        
        return ans;

    }
}