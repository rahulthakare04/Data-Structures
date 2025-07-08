package Array;

public class LinearSearchBoolean {
    public static void main(String[] args) {
        int [] arr={4,7,6,2,1,5,8,9,65,45,12,78,47};
        int n=arr.length;
        int key=7;
        boolean flag=false;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==key){
                flag=true;
            }
        }
        if(flag==true)
            System.out.println("the element is found ");
        else
            System.out.println("element is not found ");
    }
}
