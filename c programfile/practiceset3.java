import java.util.Scanner;
public class practiceset3 {
    public static void main(String[]arg){
        // Scanner sc=new Scanner(System.in);
        //  int a,b,c;
        //  System.out.println("enter the marks of physics : ");
        //  a = sc.nextInt();
        //  System.out.println("enter the marks of maths :"); 
        //  b = sc.nextInt();


        //  System.out.println("enter the marks of chemistry : ");   
        //  c = sc.nextInt();
        //  int total =a+b+c;
        //  float avg=total/3f;
        //  if (avg>40 && a>33 && b>33 && c>33) {
        //     System.out.println("congrats you are promoted");
            
            
        //  }
        //  else{
        //     System.out.println("you fail");
        //  }





         
        // int a=10;
    
        // if (a==11) {
            // System.out.println("im old");   
        // }
        // else{
            // System.out.println("im not kid");
        // }
        // problem3

Scanner sc=new Scanner(System.in);  
float income =2.5f;
float tax=0;
System.out.println("enter the value of income");
float a = sc.nextFloat();
if (income>=0 && income<=2.5f) {
    tax = income+0f; 
}
else if (income>2.5 && income<=5.0) {
     tax =income+0.05f;
    
} else if(income>5.0 && income<=10.0){
    tax=tax+0.05f;
    
}
else if(income>10.0 && income<=30.0){
    tax=income+0.05f+0.10f;
        }
    System.out.println("this is ur tax"+tax);
    }
}





