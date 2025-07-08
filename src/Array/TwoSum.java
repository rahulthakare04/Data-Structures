package Array;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr= {7,8,6,4,3,5,9};
        int x=7;
        int n=arr.length;
        for(int i=0; i < n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(i+" "+ j );
                    break;
                }
            }
        }
    }

}
