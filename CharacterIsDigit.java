import java.util.*;
public class CharacterIsDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c>=48 && c<=57)
            System.out.println("It is a digit");
        else
            System.out.println("Not a digit");
    }
}
