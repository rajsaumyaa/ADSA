class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int i = 0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
// Time Complexity: O(N) where N is the length of the array, as we traverse the array once.
// Space Complexity: O(1) as we are using only a constant amount of extra space.