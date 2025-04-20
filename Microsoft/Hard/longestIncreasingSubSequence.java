import java.util.*;
public class longestIncreasingSubSequence {
    public static int lcs(int nums[], int newArr[]){
        int n=nums.length;
        int m=newArr.length;
        int dp[][]= new int[n+1][m+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(nums[i-1]==newArr[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        int nums[]={10,9,2,5,3,7,101,18};      //output -> 4
        // int nums[]={0,1,0,3,2,3};          //output -> 4
        // int nums[]={7,7,7,7,7,7,7}           //output -> 1

        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums) set.add(num);
        int newArr[]=new int[set.size()];
        int i=-1;
        for(int v:set){
            newArr[++i]=v;
        }
        int ans=lcs(nums,newArr);

        System.out.println(ans);
    }
}
