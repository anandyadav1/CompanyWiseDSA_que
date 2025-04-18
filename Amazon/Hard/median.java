public class median {
    public static double findMedian(int nums1[], int nums2[]){
        int N1=nums1.length;
        int N2=nums2.length;

        if(N1>N2){
             return findMedian(nums2, nums1);
        }
        int low=0;
        int high=N1;
        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=(N1+N2+1)/2 -mid1;

            double L1=(mid1==0) ? Integer.MIN_VALUE : nums1[mid1-1];
            double R1=(mid1==N1) ? Integer.MAX_VALUE : nums1[mid1];
            double L2=(mid2==0) ? Integer.MIN_VALUE : nums2[mid2-1];
            double R2=(mid2==N2) ? Integer.MAX_VALUE : nums2[mid2];

            if(L1<=R2 && L2<=R1){
                if((N1+N2)%2==0){
                    return (double)(Math.max(L1, L2)+ Math.min(R1,R2))/2;
                }else{
                    return (double)Math.max(L1,L2);
                }
            }
            else if(L1>R2){
                high=mid1-1;
            }else{
                low=mid1+1;
            }
        }


        return 0;
    }
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[]={2,5,7};
        System.out.println(findMedian(nums1,nums2));
    }
}
