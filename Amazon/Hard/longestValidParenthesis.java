import java.util.Stack;

public class longestValidParenthesis {
    public static int validParenthes(String symbol) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans = 0;
        for (int i = 0; i < symbol.length(); i++) {
            char ch = symbol.charAt(i);
            int curr = i;
            if (ch == '(') {
                st.push(i);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
                if (!st.isEmpty()) {
                    ans = Math.max(ans, curr - st.peek());
                }else{
                    st.push(curr);
                }

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String symbol = ")()()(()))()";
        System.out.println(validParenthes(symbol));
    }
}
