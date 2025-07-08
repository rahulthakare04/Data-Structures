package Array;

public class FindMax {
    public static void main(String[] args) {
        int [] arr={ 7,8,65,14,25,98,75,36,21,54,4};
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
//            if(arr[i]>max) max=arr[i];
            max=Math.max(max,arr[i]);
        }
        System.out.println("max element is : "+max);

    }
}
