//replacing even numbers with 0
class am7{
    public static int[] solve(int[]arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2==0){
                arr[i] =0;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={1,2,4,7,8};
        int[] res = solve(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}