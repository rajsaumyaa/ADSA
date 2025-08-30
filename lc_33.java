class Solution {
    public int search(int[] nums, int target) {
       int left = 0,right = nums.length - 1;

       while( left <= right ){
        int mid = left + (right-left)/2;

        if(nums[mid] == target){
            return mid;
        }
        if(nums[left] <= nums[mid]){
            if(target >= nums[left] && target < nums[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }
        else{
            if(target > nums[mid] && target <= nums[right]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }
       }
       return -1; 
    }
}
// Time Complexity: O(log N) as we are halving the search space in each iteration.
// Space Complexity: O(1) as we are using only a constant amount of extra space.