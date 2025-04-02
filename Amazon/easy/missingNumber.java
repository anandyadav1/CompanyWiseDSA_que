package easy;
// package Amazon;

public class missingNumber {
    public static void main(String[] args) {
        int a[]={3,5,2,4,0,1};   //check for arr length
        int n_xor=a.length;
        for(int i=0; i<a.length; i++){
            n_xor=n_xor^i;
            n_xor=n_xor^a[i];
        }
        System.out.println(n_xor);
    }
}
