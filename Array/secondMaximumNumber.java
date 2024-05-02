//Finding the Second Maximum Number.

public class secondMaximumNumber {
    public static void main(String[] args) {
        int max1, max2;
        int A[] = {24, 56, 48, 95, 45, 16};
        max1 = max2 = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if (A[i] > max2) {
                max2 = A[i];
            } 
        }
        System.out.println("The Second Maximum Number is "+ max2);
    }
}
