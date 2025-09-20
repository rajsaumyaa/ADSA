import java.util.Scanner;
public class Team{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for(int i=0;i<n;i++){
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            if(p+v+t >=2){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
// Time Complexity: O(N) where N is the number of teams, as we traverse the list of teams once.
// Space Complexity: O(1) as we are using only a constant amount of extra space.