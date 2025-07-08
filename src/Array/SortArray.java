package Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] arr={ 7,8,65,14,25,98,75,36,21,54,4};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
