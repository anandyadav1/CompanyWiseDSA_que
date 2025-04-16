import java.util.ArrayList;
import java.util.Arrays;

public class goodDays {
    public static void main(String[] args) {
        int days[] = { 5, 3, 3, 3, 5, 6, 2 };
        int time = 2;
        int n = days.length;
        Integer prefix[] = new Integer[n];
        int suffix[] = new int[n];
        int count = 0;
        prefix[0] = count;
        for (int i = 1; i < n; i++) {
            if (days[i] <= days[i - 1]) {
                count++;
            } else {
                count = 0;
            }
            prefix[i] = count;
        }
        count = 0;
        suffix[n - 1] = count;
        for (int i = n - 2; i >= 0; i--) {
            if (days[i] <= days[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            suffix[i] = count;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (prefix[i] >= time && suffix[i] >= time) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
