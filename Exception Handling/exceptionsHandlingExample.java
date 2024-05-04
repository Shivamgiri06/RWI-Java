//Exceptions Handling Example

public class exceptionsHandlingExample {
    public static void main(String[] args) {
        int a, b, c;
        /*a = 5;
        b = 0;
        c = a / b;

        System.out.println(c); //Program will stop on this line because of 5/0 = infinite
        System.out.println("End of Program");
        System.out.println("Good Bye");*/

        try {
            a = 10;
            b = 0;
            c = a / b;
            System.out.println("Result is: "+c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible ");
        }
    }
}