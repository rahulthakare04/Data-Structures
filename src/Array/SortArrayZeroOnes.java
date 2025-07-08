package Array;

public class SortArrayZeroOnes {
    public static void main(String[] args) {
        int [] arr={1,0,0,1,1,1,0,0,1,0 };
        int n= arr.length;
        int sZero=0;
        int sOne=0;

        for(int i=0; i<n;i++){
            if(arr[i]==0)
                sZero++;
            else
                sOne++;
        }

        for(int i=0;i<n;i++){
            if(i<sZero)
            arr[i]=0;
            else
                arr[i]=1;

        }

        for(int ele :arr ){
            System.out.print(ele+" ");
        }
    }
}
