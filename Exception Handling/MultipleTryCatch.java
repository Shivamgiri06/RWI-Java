public class MultipleTryCatch {
    public static void main(String[] args) {
        int A[] = {30, 20, 10, 40, 0};

        try {
            int C = A[0] / A[1];
            System.out.println("Division is "+C);
            //if there is an exception then the next line is not executed.
            
            try {
                System.out.println(A[5]);
            } catch (Exception e) {
                System.out.println("Index is Invalid!");
            }
        } catch (Exception e) {
            System.out.println("Denominator should not be 0");
        }
        System.out.println("Bye");
    }
}
