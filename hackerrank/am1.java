class am1{
    public static int solve(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int [] arr = {3,6,7,9,10};
        System.out.println(solve(arr));
    }
}