import java.util.*;

public class _4Sum {
    public static List<List<Integer>> helper(int nums[], int target) {
        int n = nums.length;
        if (nums == null || n < 4)
            return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = i + 1;
                int right = n - 1;
                while (left < right) {
                    int sum = 0;
                    sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        set.add(list);
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        int target=0;                       //output -> [[-2, 0, 0, 2], [-2, -1, 1, 2], [-1, 0, 0, 1]]


        // int nums[] = {2,2,2,2,2};
        // int target=8;                       //output -> [[2, 2, 2, 2]]
        List<List<Integer>> res = new ArrayList<>();
        res = helper(nums,target);
        System.out.println(res);
    }
}
