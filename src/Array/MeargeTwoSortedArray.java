package Array;
// 3 pointer
public class MeargeTwoSortedArray {
    public static void main(String[] args) {
        int [] a={11,33,42,71};
        int [] b={26,54,69,81};
        int n=a.length;
        int m=b.length;
        int [] c =new int[n+m];
        int i=0,j=0,k=0;

        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else {
                c[k]=b[j];
                j++;
            }
            k++;

        }

        for(int ele : c){
            System.out.print(ele+" ");
        }



    }
}
