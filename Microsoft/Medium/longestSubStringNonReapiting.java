import java.util.*;
public class longestSubStringNonReapiting {
    public static int helper(String str){
        Queue<Character> q = new LinkedList<>();
        int ans=0;
        for(char ch:str.toCharArray()){
            if(q.contains(ch)){
                while (!q.isEmpty() && q.peek()!=ch) {
                    q.poll();
                }
                q.poll();
                q.offer(ch);
                ans=Math.max(ans,q.size());
            }else{
                q.offer(ch);
                ans=Math.max(ans,q.size());
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(helper(str));
    }
}
