class Solution {
    public int minimumArea(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int minRow = rows, maxRow = -1;
        int minCol = cols, maxCol = -1;

        for(int r = 0; r<rows; r++){
            for(int c = 0; c<cols; c++){
                if(grid[r][c] == 1){
                    minRow = Math.min(minRow, r);
                    maxRow = Math.max(maxRow, r);
                    minCol = Math.min(minCol, c);
                    maxCol = Math.max(maxCol, c);
                }
            }
        }
        if(maxRow == -1) return 0;

        int height = maxRow - minRow + 1;
        int width = maxCol - minCol + 1;

        return height * width;
    }
}
// Time Complexity: O(M * N) where M is the number of rows and N is the number of columns in the grid, as we traverse the entire grid once.
// Space Complexity: O(1) as we are using only a constant amount of extra space.