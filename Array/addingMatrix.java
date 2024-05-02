//Adding two matrix and create another matrix

public class addingMatrix {
    public static void main(String[] args) {
        int A[] [] = {{3, 4, 5}, {5, 8, 3}, {6, 8, 5}};
        int B[] [] = {{1, 2, 3}, {5, 9, 6}, {8, 5, 2}};

        int C[] [] = new int[3] [3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j]+B[i][j];
            }
        }

        for(int x[] : C) {
            for(int y : x) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
