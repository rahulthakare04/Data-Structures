package Array;

public class Que1 {
    public static void main(String[] args) {
        int [] arr={81,17,45,36,31,100,60};
        int n=arr.length;

        for (int i = 0; i <n ; i++) {
            if (arr[i] < 35) {

                System.out.println("roll no of student that are failed  :"+i);
            }

        }
    }
}
