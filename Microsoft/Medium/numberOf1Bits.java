import java.util.Scanner;

public class numberOf1Bits {
    public static int count(int n){
        int ct=0;
        while(n != 0){
            if((n&1)==1) ct++;
            n >>=1;
        }

        return ct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number for check to the numbers of 1 bits");
        int n=sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.parseInt(Integer.toBinaryString(n),2));
        System.out.println("Total number of 1,s bit = "+count(n));
    }
}