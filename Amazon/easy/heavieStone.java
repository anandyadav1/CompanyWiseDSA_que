
// package easy;
import java.util.*;

public class heavieStone {
    public static void main(String[] args) {
        int stone[]={2,7,4,1,8,1};
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int num:stone){
            pq.add(num);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y){
                pq.add(x-y);
            }
        }
        int ans=(pq.isEmpty()) ? 0 : pq.poll();
        System.out.println(ans);
    }
}
