import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long oddCount = (n+1) / 2;
        
        if(k <= oddCount){
            System.out.println(2*k-1);
            
        }else{
            System.out.println(2*(k - oddCount));
        }
    } 
}
// Time Complexity: O(1) as we are performing a constant number of operations.
// Space Complexity: O(1) as we are using only a constant amount of extra space.