import java.util.*;

public class _3Sum {
    public static List<List<Integer>> helper(int nums[]){
        int n=nums.length;
        if(nums==null || n<3) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            int left=i+1;
            int right=n-1;
            while (left<right) {
                int sum=0;
                sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = new ArrayList<>();
        res=helper(nums);
        System.out.println(res);
    }
}
