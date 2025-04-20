import java.util.Scanner;

public class pascalTrangle {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value for pascal trangle");
        int n=sc.nextInt();
        int grid[][]=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || i==j){
                    grid[i][j]=1;
                }else{
                    grid[i][j]=grid[i-1][j-1]+grid[i-1][j];
                }
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
