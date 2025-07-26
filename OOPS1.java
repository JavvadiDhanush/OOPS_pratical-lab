package DHANUSH;
import java.util.Scanner; 

public class OOPS1 {
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);

     
        System.out.println("Enter first number:");
        int x = sc.nextInt(); 

        System.out.println("Enter second number:");
        int y = sc.nextInt(); 

     
        int sum = x + y;

       
        System.out.println("Sum is: " + sum);

       
        sc.close();
    }
}