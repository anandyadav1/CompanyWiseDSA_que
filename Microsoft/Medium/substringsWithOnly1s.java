public class substringsWithOnly1s {
    public static int find(String str, long mod) {
        long count = 0;
        long ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            } else {
                long add = (count * (count + 1)) / 2;
                add = add % mod;
                ans = (ans + add) % mod;
                count = 0;
            }
        }
        long add = (count * (count + 1)) / 2;
        add = add % mod;
        ans = (ans + add) % mod;

        return (int)ans;
    }

    public static void main(String[] args) {
        String str = "0110111";
        long mod = 1000000007;
        System.out.println(find(str, mod));
    }
}
