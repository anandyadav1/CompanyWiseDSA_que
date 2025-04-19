
public class validPalindrome {
    public static boolean check(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="A ma4n,a plan, a 3 4  canal: Panama";
        String newStr="";
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                newStr +=Character.toLowerCase(ch);
            }
        }
        System.out.println(newStr);
        System.out.println(check(newStr));
    }
}
