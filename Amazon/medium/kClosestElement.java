import java.util.PriorityQueue;

public class kClosestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=4;
        int x=3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k; i<arr.length; i++){
            if(Math.abs(x-pq.peek()) > Math.abs(x-arr[i])){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+" ");
        }
    }
}
