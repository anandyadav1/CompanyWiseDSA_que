public class longestCommonSubString {
    public static int call(String str1, String str2){
        int n=str1.length();
        int m=str2.length();
        int ans=0;
        int dp[][]=new int[n+1][m+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    ans=Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1="anandyadavadarshmaurya";
        String str2="yadavji";
        System.out.println(call(str1,str2));
    }
}
