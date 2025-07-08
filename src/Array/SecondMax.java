package Array;

public class SecondMax {
    public static void main(String[] args) {
        int [] arr={ 7,8,65,14,25,98,75,36,21,54,4};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            max=Math.max(arr[i],max);
        }
        for (int i = 0; i <n ; i++) {
            if(max != arr[i])
               smax=Math.max(arr[i],smax);
        }

        System.out.println("second max is : "+ smax);
    }
}
