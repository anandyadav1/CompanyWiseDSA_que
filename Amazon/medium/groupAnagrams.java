import java.util.*;
public class groupAnagrams {
    public static void main(String[] args) {
        String str[]={"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String ,List<String>> map = new HashMap<>();
        for(String s:str){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String st=String.valueOf(ch);
            if(map.get(st)!=null){
                List<String> a = map.get(st);
                a.add(s);
                map.put(st,a);
            }else{
                List<String> a = new ArrayList<>();
                a.add(s);
                map.put(st,a);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> x : map.entrySet()){
            ans.add(x.getValue());
        }

        System.out.println(ans);
    }
}
