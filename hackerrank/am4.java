//largest element in array
class am4{
    public static int solve(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int [] arr = {12,45,2,10};
        System.out.println(solve(arr));
    }
}