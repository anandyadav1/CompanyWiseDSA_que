import java.util.*;

public class imageRotate {
    public static void swap(int a[]){
        int i=0;
        int j=a.length-1;
        while (i<j) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int image[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // using extra space
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<image.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<image.length; j++){
                list.add(image[i][j]);
            }
            res.add(list);
        }

        int n=res.size();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                image[j][n-1-i]=res.get(i).get(j);
            }
        }
        for(int a[]:image){
            for(int v:a){
                System.out.print(v+" ");
            }
            System.out.println();
        }

        System.out.println();


        

        //without using extra spce
        int row=image.length;
        for(int i=0; i<row; i++){
            for(int j=i+1; j<row; j++){
                int temp=image[i][j];
                image[i][j]=image[j][i];
                image[j][i]=temp;
            }
        }
        for(int a[]:image){
            swap(a);
        }
        for(int a[]:image){
            for(int v:a){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
}