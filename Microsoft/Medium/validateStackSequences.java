import java.util.Stack;

public class validateStackSequences {
    public static boolean check(int pushed[], int popped[]) {
        if (pushed == null && popped == null)
            return true;
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            while (!st.empty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
            st.push(pushed[i]);
        }
        while (!st.empty() && st.peek() == popped[j]) {
            st.pop();
            j++;
        }

        return st.empty();
    }

    public static void main(String[] args) {
        int pushed[] = { 1, 2, 3, 4, 5 };
        int popped[] = { 4, 5, 3, 2, 1 };

        // output -> true

        System.out.println(check(pushed, popped));
    }
}
