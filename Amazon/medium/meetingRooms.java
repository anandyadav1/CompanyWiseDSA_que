import java.util.TreeMap;
import java.util.*;

public class meetingRooms {
    public static void main(String[] args) {
        int arr[][]={ {0,30}, {5,10}, {15,20} };
        TreeMap<Integer, Integer> treeMap= new TreeMap<>();
        for(int ar[]:arr){
            int start=ar[0];
            int end=ar[1];
            treeMap.put(start,treeMap.getOrDefault(start, 0)+1);
            treeMap.put(end,treeMap.getOrDefault(end, 0)-1);
        }
        int ans=0;
        int count=0;
        for (Map.Entry<Integer,Integer> entry : treeMap.entrySet()){
            count +=entry.getValue();
            ans=Math.max(ans, count);
        }
        System.out.println(ans);
    }
}
