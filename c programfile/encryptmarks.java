import java.util.Scanner;
public class encryptmarks {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the grade");
        int grade = sc.nextInt();
        int number=grade+8;
        System.out.println("this is the encrypted marks : "+number);
    

    }
}
