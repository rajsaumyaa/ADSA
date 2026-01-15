//count adjacent equal elements
class am6{
    public static int solve(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,3};
        System.out.println(solve(arr));
    }
}