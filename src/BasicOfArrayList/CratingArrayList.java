package BasicOfArrayList;

import java.util.ArrayList;

public class CratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(6);
        System.out.println(arr);
        arr.add(0,1);
        arr.add(1,2);
        arr.add(2,3);
        arr.add(3,4);
        arr.add(4,5);
        arr.add(5,6);
        System.out.println(arr);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        arr.set(2,33);
        System.out.print(arr);
        System.out.println();
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.add(44);
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
