class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        while (left<right){
            int mid = left+ (right - left)/2;

            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else if(nums[mid] < nums[right]){
                right = mid;
            }else{
                right --;
            }
        }
        return nums[left];
    }
}
// Time Complexity: O(log N) on average, but can degrade to O(N) in the worst case due to duplicates.
// Space Complexity: O(1) as we are using only a constant amount of extra space.