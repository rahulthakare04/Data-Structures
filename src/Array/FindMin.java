package Array;

public class FindMin {
    public static void main(String[] args) {
        int [] arr={ 7,8,65,14,25,98,75,36,21,54,4};
        int n=arr.length;
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            min=Math.min(min,arr[i]);

        }
        System.out.println("min value is : "+ min);

    }
}
