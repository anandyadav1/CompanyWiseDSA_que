import java.util.Scanner;

public class climbingStairs {
    public static int solutions(int n){
        if(n<0) return 1;
        int dp[]=new int[n+1];
        //can take move 1 or 2 step
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<n+1; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for nth Stairs");
        int n=sc.nextInt();
        System.out.println(solutions(n));
    }
}
