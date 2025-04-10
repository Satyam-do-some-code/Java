import java.util.Scanner;
public class sumOftwoNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers for sum");

        System.out.print("Enter 1st no.");
        int a = sc.nextInt();
        
        System.out.print("Enter 2nd no.");
        int b = sc.nextInt();

        System.out.println("Sum of two no. are : "+ (a + b) );
    }
}
