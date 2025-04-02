package easy;
public class sort2 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 3, 4, 5, 6, 6, 7, 8 };
        // Output= 1 2 3 3 4 4 5 5 6 6 7 8
        int c[]=new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int id=0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[id]=a[i];
                id++;
                i++;
            }else{
                c[id]=b[j];
                id++;
                j++;
            }
        }

        while(i<a.length){
            c[id]=a[i];
            i++;
            id++;
        }
        while(j<b.length){
            c[id]=b[j];
            j++;
            id++;
        }

        for(int num:c){
            System.out.print(num+"  ");
        }
    }
}
