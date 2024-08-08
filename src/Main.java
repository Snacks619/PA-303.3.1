import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length()+ B.length());

        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        System.out.println(capitalizeFirst(A) + " " + capitalizeFirst(B));
    }
    private static String capitalizeFirst(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) +str.substring(1);


    }
}
