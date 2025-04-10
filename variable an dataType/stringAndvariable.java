public class stringAndvariable {
    public static void main(String[] args) {
        int a = 10, b = 5 , c = 8;
        c++;

        System.out.println("Hello " + a + b + c ); // we will get Hello 1058;

        // To fix this 
        System.out.println("Hello " + (a + b + c));  // () will prorties the code
    }
}
