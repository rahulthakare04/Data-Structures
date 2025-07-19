package Array2D;

import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        Scanner sc =new Scanner(System.in);

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                max=Math.max(arr[i][j],max);
            }
        }

        System.out.println("max element is arry is "+ max);

    }



}
