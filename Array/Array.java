//Array

public class Array {
    public static void main(String[] args) {
        
        //Method 1 of Declaration of Array
        int[] A = new int[10];
        //Also Write in this way
        int X[] = new int[10];

        //Method 2 of Declaration of Array
        int[] B = {10, 45, 12, 32, 5};

        //Method 3 of Declaration of Array
        int[] C;
        C = new int[10];

        B[1] = 20; //for replacing the value in the array.

        //Loop for printing all the values of the array. This loop will only print the values of the array.
        for (int i : B) {
            System.out.println(i);
        }

        //To print the values of the array as well as also modified the values of the array, use "Counter Controlled For Loop".
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
        System.out.println(A);
        System.out.println(X);
        System.out.println(C);
    }
}