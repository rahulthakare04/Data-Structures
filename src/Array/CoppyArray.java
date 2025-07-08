package Array;

import java.util.Arrays;

public class CoppyArray {
    public static void main(String[] args) {
        int [] arr={ 7,8,65,14,25,98,75,36,21,54,4};
            for(int ele : arr){
                System.out.print(ele + " ");
            }
        System.out.println();
        int [] nums=arr;//shallyo copy
           nums[0]=100;
        System.out.println(arr[0]);

            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+ " ");
            }
        System.out.println();

         //Deep copy
        int [] brr= Arrays.copyOf(arr,arr.length);
            for(int ele : brr){
                System.out.print(ele+ " ");
            }

    }

}
