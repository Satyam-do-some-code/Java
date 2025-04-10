import java.util.Scanner;

public class simpleIntrestProgram {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the following values :");

        System.out.print("Enter P :");
        double p = sc.nextDouble();

        System.out.print("Enter r :");
        double r = sc.nextDouble();

        System.out.print("Enter t :");
        double t = sc.nextDouble();

        double SI = (p*r*t) / 100;

        System.out.println("Simple Interest : " + SI);
    }
}
