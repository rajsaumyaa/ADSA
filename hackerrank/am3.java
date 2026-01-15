//palindrome number
class am3{
    public static boolean solve(int num){
    int original = num;
    int reverse = 0;
    while(num>0){
        reverse = reverse * 10 + (num %  10);
        num = num / 10;
    }
    return original == reverse;
    }
    public static void main(String[] args){
        int n = 1221;
        if(solve(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
