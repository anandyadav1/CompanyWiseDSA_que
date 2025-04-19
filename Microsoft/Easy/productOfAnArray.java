public class productOfAnArray {
    public static int arraySign(int arr[]){
        int count=0;    //this is count for the negative sign
        for(int nums:arr){
            if(nums==0) return 0;
            else if(nums<0){
                count++;
            }
        }
        if(count%2==0){
            return 1;      //if count is even then return 1
        }else{
            return -1;      //otherwise -1
        }
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4,3,2,1};
        System.out.println("Sign = "+arraySign(arr));
    }
}
