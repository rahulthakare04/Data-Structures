package Array;

public class SortArryOfZeroOneTwo {
    public static void main(String[] args) {
        int [] arr={ 1,2,0,1,2,0,2,0,1,0,1,2,0,1,2,0};
        int n=arr.length;
        int sZero=0,sOne=0,sTwo=0;
        for(int i=0; i< n;i++){
            if(arr[i]==0) sZero++;
            else if(arr[i]==1) sOne++;
            else sTwo++;
        }
        for(int j=0;j<n;j++){
            if(j<sOne)
                arr[j]=0;
            else if (j<sZero+sOne)
                arr[j]=1;
            else
                arr[j]=2;


        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
