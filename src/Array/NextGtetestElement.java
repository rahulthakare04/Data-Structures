package Array;

public class NextGtetestElement {
    public static void main(String[] args) {
        int [] arr={ 12,8,41,37,2,49,16,28,21};
        int n= arr.length;
        int [] ans=new int[n];
        int max=0;

        //brut force

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                max=Math.max(max,arr[j]);
            }
            ans[i]=max;
            max=0;

        }
        ans[n-1]=-1;



        for (int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
