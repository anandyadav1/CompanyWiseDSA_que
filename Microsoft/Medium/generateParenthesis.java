import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class generateParenthesis {
    public static void helper(List<String> ans , int openCount, int closeCount, String str, int n){
        if(openCount==n && closeCount==n){
            ans.add(str);
            return;
        }
        if(openCount<n){
            helper(ans, openCount+1, closeCount, str+"(", n);
        }if(openCount>closeCount){
            helper(ans, openCount, closeCount+1, str+")", n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for generate for valid parenthesis");
        int n=sc.nextInt();
        //n=1 -> ()   output->   [()]
        //n=2 -> ()()  output->    [(()), ()()]
        //n=3 -> ()()()   output->   [((())), (()()), (())(), ()(()), ()()()]
        //n=4 -> ()()()()   output->   [(((()))), ((()())), ((())()), ((()))(), (()(())), (()()()), (()())(), (())(()), (())()(), ()((())), ()(()()), ()(())(), ()()(()), ()()()()]
        List<String> ans = new ArrayList<>();
        int openCount=0;
        int closeCount=0;
        String str="";
        helper(ans,openCount,closeCount,str,n);

        System.out.println(ans);
    }
}