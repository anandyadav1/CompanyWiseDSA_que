import java.util.Scanner;

public class palindromeNumber {
    public static boolean check(int num){
        if(num<0){
            return false;
        }
        int rev=0;
        int temp=num;
        while (temp != 0) {
            int rem=temp%10;
            rev=(rev*10) + rem;
            temp /=10;
        }
        if(rev!=num){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number for check to palindrome or not");
        int num=sc.nextInt();
        System.out.println(check(num));
    }
}
