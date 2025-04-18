import java.util.PriorityQueue;

public class findMedian {
    static PriorityQueue<Integer> minHeep = new PriorityQueue<>();
    static PriorityQueue<Integer> maxHeep = new PriorityQueue<>((a, b) -> b - a);

    public static void addNum(int num){
        maxHeep.offer(num);
        minHeep.offer(maxHeep.poll());
        if(minHeep.size() > maxHeep.size()){
            maxHeep.offer(minHeep.poll());
        }
    }
    public static double findMedians(){
        if(maxHeep.size() > minHeep.size()){
            return maxHeep.peek();
        }

        return  (minHeep.peek() + maxHeep.peek())/2.0d;

    }
    public static void main(String[] args) {
        addNum(1);
        addNum(2);
        System.out.println(findMedians());
        addNum(3);
        System.out.println(findMedians());
        addNum(4);
        System.out.println(findMedians());
    }
}
