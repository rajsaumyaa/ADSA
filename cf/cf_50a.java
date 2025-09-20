
import java.util.*;
public class cf_50a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int maxDominos = (M*N)/2;
        sc.close();
        
        System.out.println(maxDominos);
    }
}
