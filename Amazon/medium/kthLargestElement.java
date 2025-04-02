import java.util.PriorityQueue;

public class kthLargestElement {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        int k=4;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k; i<arr.length; i++){
            pq.add(arr[i]);
            pq.poll();
        }
        System.out.println(pq.poll());
    }
}
