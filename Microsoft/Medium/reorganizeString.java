import java.util.*;

public class reorganizeString {
    public static String solutions(String str) {
        int freq[] = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        var pq = new PriorityQueue<int[]>((a, b) -> Integer.compare(b[1], a[1]));
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.offer(new int[] { i + 'a', freq[i] });
            }
        }
        StringBuilder sb = new StringBuilder();
        int block[] = pq.poll();
        sb.append((char) block[0]);
        block[1]--;
        while (!pq.isEmpty()) {
            int next[] = pq.poll();
            sb.append((char) next[0]);
            next[1]--;
            if (block[1] > 0) {
                pq.offer(block);
            }
            block = next;
        }
        if (block[1] > 0) {
            return "";
        } else {
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String str = "aab"; // output -> aba
        // String str= "aaab"; // output -> ""
        // String ans = solutions(str);
        System.out.println(solutions(str));
        ;
    }
}
