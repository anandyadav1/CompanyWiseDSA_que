public class gcdOfString {
    public static String findGcdOfString(String str1, String str2){
        if(str1.length()<str2.length()){
            return findGcdOfString(str2, str1);
        }else if(!str1.startsWith(str2)){
            return "";
        }else if(str2.isEmpty()){
            return str1;
        }else{
            return findGcdOfString(str1.substring(str2.length()), str2);
        }
    }
    public static void main(String[] args) {
        String str1="ABABABAB";
        String str2="AB";
        //output  --> AB
        System.out.println(findGcdOfString(str1,str2));
    }
}
