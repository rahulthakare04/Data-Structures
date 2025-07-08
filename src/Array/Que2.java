package Array;
//calculating the sum of all the element of the array
public class Que2 {
    public static void main(String[] args) {
        int [] arr = {1,5,6,7,8,9,14,65,5,9,47,4};
        int n= arr.length;
        int sum=0;

        for (int i = 0; i < n; i++) {
        sum+=arr[i];

        }
        System.out.println("sum of the array is :"+ sum);
    }
}
