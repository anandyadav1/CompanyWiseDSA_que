package easy;
public class sort1 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0};
        int b[] = { 3, 4, 5, 6, 6, 7, 8 };
        // Output= 1 2 3 3 4 4 5 5 6 6 7 8
        int id = a.length-1;
        int j = b.length-1;
        int i = id-b.length;
        while (i >= 0 && j >= 0) {
            if (a[i] < b[j]) {
                a[id] = b[j];
                id--;
                j--;
            } else {
                a[id] = a[i];
                id--;
                i--;
            }
        }

        while (i >= 0) {
            a[id] = a[i];
            i--;
            id--;
        }
        while (j >= 0) {
            a[id] = b[j];
            j--;
            id--;
        }

        for (int num : a) {
            System.out.print(num + "  ");
        }
    }
}
