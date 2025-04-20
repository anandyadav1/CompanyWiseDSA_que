import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int nums[]={100,4,200,1,3,2};     //output --> 1,2,3,4
                                                        //ans=4
        Set<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        int ans=0;
        for(int num:nums){
            int start=num-1;
            int nextEle=num+1;
            if(!set.contains(start)){
                int countLength=1;
                while (set.contains(nextEle)) {
                    countLength++;
                    nextEle++;
                }
                ans=Math.max(ans,countLength);
            }
        }
        System.out.println(ans);

    }
}
 