public class raceCar {
    public static int racecar(int target){
        int dp[] = new int[target+1];
        int n=1;
        for(int i=0; i<=target; i++){
            if(i==Math.pow(2,n)-1){
                dp[i]=n;
                n++;
            }else{
                for(int j=0; j<n-1; j++){
                    dp[i]=Math.min(dp[i], n+j+1+dp[i-(int)Math.pow(2,n-1)+(int)Math.pow(2,j)]);
                }
                dp[i]=Math.min(dp[i],n+1+dp[(int)Math.pow(2,n)-1-i]);
            }
        }
        return dp[target];
    }
    public static void main(String[] args) {
        int target = 3;
        System.out.println(racecar(target));
    }
}
