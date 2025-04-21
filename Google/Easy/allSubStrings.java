import java.util.*;

public class allSubStrings {
    public static List<String> find(String str){
        List<String> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                list.add(str.substring(i, j+1));
            }
        }

        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any string for find subString");
        String str = sc.next();
        List<String> ans=find(str);
        System.out.println(ans);
    }
}
