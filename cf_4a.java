import java.util.Scanner;
 
public class Watermelon{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        
        if(w>2 && w%2==0){
            System.out.println("YES");
            
        }else{
            System.out.println("NO");
        }
        scanner.close();
    }
}
// Time Complexity: O(1) as we are performing a constant number of operations.
// Space Complexity: O(1) as we are using only a constant amount of extra space.