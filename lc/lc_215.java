import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        return minHeap.peek();
    }
}
// Time Complexity: O(N log k), where N is the number of elements in the array. Each insertion and deletion operation in the min-heap takes O(log k) time, and we perform these operations N times.
// Space Complexity: O(k), since we are maintaining a min-heap of size k.