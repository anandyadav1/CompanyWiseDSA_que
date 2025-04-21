import java.util.*;
import java.util.Scanner;

public class suffix {
    public static List<String> find(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.substring(i));
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any String ");
        String str = sc.next();
        List<String> ans = find(str);
        System.out.println(ans);
    }
}
