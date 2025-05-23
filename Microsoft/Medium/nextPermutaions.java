public class nextPermutaions {
    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int nums[], int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void findPermutation(int nums[]) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i < 0) {
            reverse(nums, i + 1, n - 1);
        } else {
            int j = n - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
            reverse(nums, i + 1, n - 1);
        }

    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1};
        findPermutation(nums);
        for (int ele : nums) {
            System.out.print(ele);
        }
    }
}
