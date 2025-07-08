package Array;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        int [] ans= new int[n];
        int k=5;
        int idx=0;
        for (int i = n-k; i <n ; i++) {
            ans[idx]=arr[i];
            idx++;
        }

        for (int i = 0; i < n-k; i++) {
            ans[idx]=arr[i];
            idx++;

        }

        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
    
    
}
