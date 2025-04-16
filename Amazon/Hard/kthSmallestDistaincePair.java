import java.util.*;
public class kthSmallestDistaincePair {
    public static int solutions(int nums[], int k){
        Arrays.sort(nums);
        int n=nums.length;
        int low=0;
        int high=nums[n-1]-nums[0];
        while (low<high) {
            int mid=low+(high-low)/2;
            int count=0;
            for(int i=0,j=0; i<n; i++){
                while (j<n && nums[j]-nums[i] <= mid) {
                    j++;
                }
                count=j-i-1;
            }
            if(count<k){
                low=mid+1;
            }else{
                high=mid;
            }
        }

        return low;
    }
    public static void main(String[] args) {
        int nums[]={1,6,1};
        int k=3;
        System.out.println(solutions(nums,k));
    }
}
