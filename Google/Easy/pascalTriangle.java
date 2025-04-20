
public class pascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n + 1];
        arr[0] = 1;
        for (int i = 0; i < n + 1; i++) {
            for (int j = i; j > 0; j--) {
                arr[j] += arr[j - 1];
            }
            for (int num : arr) {
                if (num != 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}
