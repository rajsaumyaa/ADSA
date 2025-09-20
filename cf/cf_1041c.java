import java.util.*;
 
public class CoffeeBreak{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();
        int[] a = new int[n];
        int[] ans = new int [n];
        Integer[] idx = new Integer[n];
        
        for(int i = 0;i < n; i++){
            a[i] = sc.nextInt();
            idx[i] = i;
        }
        Arrays.sort(idx, Comparator.comparingInt(i -> a[i]));
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x[0]));
        
        int days = 0;
        for(int i : idx){
            if(!pq.isEmpty() && pq.peek()[0] + d < a[i]) {
                int [] top = pq.poll();
                ans[i] = top[1];
                pq.offer(new int [] {a[i], top[1]});
            }else{
                days++;
                ans[i] = days;
                pq.offer(new int[] {a[i], days});
            }
        }
        System.out.println(days);
        for(int x : ans) System.out.print(x + " ");
    }
}
// Time Complexity: O(N log N) where N is the number of tasks, due to sorting and priority queue operations.
// Space Complexity: O(N) for storing the arrays and priority queue.