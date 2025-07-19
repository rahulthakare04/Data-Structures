package Array2D;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int [][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr2={{9,8,7},{6,5,4},{3,2,1}};

        int n= arr1.length;
        int m=arr1[0].length;
        int [][] res=new int  [m][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                res[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
