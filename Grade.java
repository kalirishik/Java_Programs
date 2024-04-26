import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int g=(int)(n1+n2+n3)/3;
        String s=(g>90 && g<=100)?"O":((g>80 && g<=90)?"A":((g>80 && g<=70)?"B":((g>70 && g<=60)?"C":((g>60 && g<=50)?"D":"E"))));
        System.out.println(s);
    }
}
