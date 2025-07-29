package strings;

public class Equals {

    public static void main(String[] args) {
        String s="abcxyz";
        String a="abc";
        a+="xyz";
        System.out.println(s==a);
        System.out.println(s.equals(a));
    }
}
