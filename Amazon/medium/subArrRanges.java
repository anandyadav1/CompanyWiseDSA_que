public class subArrRanges {
    public static int helper(int arr[], int n){
        int ans=0;
        for(int i=0; i<n; i++){
            int minValue=arr[i];
            int maxValue=arr[i];
            for(int j=i; j<n; j++){
                minValue=Math.min(minValue,arr[j]);
                maxValue=Math.max(maxValue,arr[j]);
                ans +=maxValue-minValue;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n=arr.length;
        int totalSum=helper(arr,n);
        System.out.println(totalSum);
    }
}
