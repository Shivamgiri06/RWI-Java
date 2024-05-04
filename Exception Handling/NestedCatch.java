public class NestedCatch {
    public static void main(String[] args) {
        int A[] = {30, 20, 10, 40, 0};

        try {
            int C = A[0] / A[1];
            System.out.println("Division is "+C);
            System.out.println(A[5]);
        System.out.println("End of the Program!");
        } catch (ArithmeticException e){
            System.out.println("Denominator should not be 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is Invalid!");
        }
        System.out.println("Bye");
    }
}
