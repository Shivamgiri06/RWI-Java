//Multiplying Two Matrices

public class multiplyingMatrices {
    public static void main(String[] args) {
        int A[][] = {{2, 4, 9}, {8, 5, 7}, {6, 8, 3}};
        int B[][] = {{5, 9, 2}, {8, 3, 4}, {5, 6, 3}};
        int C[][] = new int[3][3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j]*B[i][j];
            }
        }

        for (int x[] : C) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
