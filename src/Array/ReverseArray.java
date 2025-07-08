package Array;

//brut fore  approach
public class ReverseArray {
    public static void main(String[] args) {
        int [] arr= { 10,20,30,40,50,60,70};
        int n=arr.length;
        //i+j=n-1
        //j=n-1-1
        for(int i=0 ; i < n/2 ; i++ ){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;

        }
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}
