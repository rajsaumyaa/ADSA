//sum of even digits in a number
class am2{
    public static int solve(int num){
        int sum = 0;
        while(num >0){
            int digit = num % 10; //gives the last digit of a number
            if(digit % 2 == 0){
                sum += digit;
            }
            num = num /10; //removes the last digit 
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(solve(123456)); // 123456% 10 = 6
                                            // 123456 / 10 = 12345
                                            
    }
}