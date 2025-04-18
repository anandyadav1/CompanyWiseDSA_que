

public class rotatedBinarySearch {
    public static int search(int[] nums, int tar) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == tar)
                return mid;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= tar && tar < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < tar && tar <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {6, 7, 8, 1, 2, 3, 4, 5};

        int tar = 5;
        System.out.println(search(nums, tar));
    }
}
