import java.util.*;

public class palindromePartions {

    private static void findPartions(List<List<String>> res, List<String> list, String s) {
        if (0 == s.length()) {
            if (list.size() > 0) {
                res.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s.substring(0, i + 1))) {
                list.add(s.substring(0, i + 1));
                findPartions(res,list, s.substring(i + 1));
                list.remove(list.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        findPartions(res,list, s);

        System.out.println(res);
    }

}
