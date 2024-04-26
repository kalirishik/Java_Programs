import java.util.*;
public class FirstCharacterIsUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char f1=s.charAt(0);
        boolean f2=Character.isUpperCase(f1);
        System.out.println(f2);


    }
}
