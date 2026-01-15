//count elements greater than avg
class am8{
    public static int solve(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length; i++){
            sum += arr[i];
        }
        int avg = sum/arr.length;
        int count = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]> avg){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr= {2,4,6,8};
        System.out.println(solve(arr));
    }
}