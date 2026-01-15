//reversing an array
class am9{
    public static int[] solve(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int [] res = solve(arr);
        for(int i=0;i<arr.length; i++){
            System.out.print(res[i] +" ");
        }
    }
}