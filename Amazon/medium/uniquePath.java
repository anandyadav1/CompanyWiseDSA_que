import java.util.*;

public class uniquePath {
    public static int dfs(int grid[][], int m, int n, int i, int j){
        if(i<0 || i>=m || j<0 || j>=n) return 0;
        if(i==m-1 && n-1==j) return 1;
        if(grid[i][j]!=-1){
            return grid[i][j];
        }else{
            return grid[i][j]=dfs(grid, m, n, i+1, j) + dfs(grid, m, n, i, j+1);
        }
    }
    public static void main(String[] args) {
        int m=3;
        int n=2;
        int grid[][]=new int[m][n];
        for(int a[]:grid){
            Arrays.fill(a,-1);
        }
        System.out.println(dfs(grid, m, n,0,0));
    }
}
