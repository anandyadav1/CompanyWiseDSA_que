import java.util.HashMap;

public class jumpGame {
    static HashMap<Integer,Boolean> memo = new HashMap<>();
    public static boolean helper(int nums[], int i){
        if(i==nums.length-1) return true;
        if(i>=nums.length && nums[i]==0) return false;
        if(memo.containsKey(i)) return false;
        boolean res=false;
        for(int j=1; j<=nums[i]; j++){
            res = helper(nums, i+j);
            if(res) return true;
        }

        return false;
    }
    public static boolean jumpGames(int nums[]){
        memo = new HashMap<>();
        return helper(nums, 0);
    }
    public static void main(String[] args) {
        int nums[]={2,3,1,2,4};
        System.out.println(jumpGames(nums));
    }
}
