class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> result = new ArrayList<>();
        int m = matrix.length;  //no. of rows
        int n = matrix[0].length; //no. of cols

        int top = 0, bottom = m-1;
        int left = 0, right = n-1;

        while (top<=bottom && left<=right){ // top row
            for(int i = left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i<=bottom; i++){ // right col
                result.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){ // bottom row
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right){ //left col
                for(int i = bottom; i>= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;

    }
}