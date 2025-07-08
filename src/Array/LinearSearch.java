package Array;

import java.util.Scanner;

//find the element in the array
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size=sc.nextInt();
        int key=5;
        int [] arr=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();

        }
        for (int i = 0; i < size; i++) {
            if(arr[i]== key){
                System.out.println("element is found at index : "+i);
            }

        }
        System.out.println("element is not found ");

    }
}
