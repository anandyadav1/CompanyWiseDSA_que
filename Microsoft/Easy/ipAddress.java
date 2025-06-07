public class ipAddress {
    public static String convert(String address){
        StringBuilder sb = new StringBuilder();
        for(char ch : address.toCharArray()){
            if(ch=='.'){
                sb.append("[.]");
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();

        //Or

        // return address.replace(".", "[.]");
    }
    public static void main(String[] args) {
        String address="1.1.1.1.1.1";
        //output -> 1[.]1[.]1[.]1

        System.out.println(convert(address));
        
    }
}