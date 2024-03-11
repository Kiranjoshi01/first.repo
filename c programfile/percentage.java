import java.util.Scanner;
public class percentage{
    public static void main(String[]arg){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the marks of physics : ");
    int physics=sc.nextInt();
    System.out.println("enter the marks of maths : ");
    int maths=sc.nextInt();
    System.out.println("enter the marks of chemistry : ");
     int chemistry= sc.nextInt();
    System.out.println("enter the marks of english : ");
    int english= sc.nextInt();
    System.out.println("enter the marks of phe : ");
    int phe= sc.nextInt();
    float total =physics+maths+chemistry+english+phe;
    float percentage=(total/500f)*100;

        System.out.println("percentage ="+percentage);
        
    }
}