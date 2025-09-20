class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;

        for(int j = 0; j<n; j++){
            int leftSmaller = 0, leftGreater = 0;
            int rightSmaller = 0, rightGreater = 0;

            for(int i =0; i<j; i++){
                if(rating[i] < rating[j]) leftSmaller++;
                else if(rating[i] > rating[j]) leftGreater++;
            }
            for(int k = j + 1; k<n; k++){
                if(rating[k] < rating[j]) rightSmaller++;
                else if(rating[k] > rating[j])rightGreater++;
            }
            count += leftSmaller * rightGreater;
            count += leftGreater * rightSmaller;

        }
        return count;
    }
}
// Time Complexity: O(N^2) where N is the length of the array, as we have a nested loop structure.
// Space Complexity: O(1) as we are using only a constant amount of extra space.