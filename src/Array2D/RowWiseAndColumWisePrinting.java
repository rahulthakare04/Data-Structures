package Array2D;

public class RowWiseAndColumWisePrinting {
    public static void main(String[] args) {
        int [][] arr={{1,2},{3,4},{5,6}};

        int m=arr.length;
        int n=arr[0].length;
       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }*/

        int [][] res=new int [n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                    res[j][i]=arr[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }


    }

}
