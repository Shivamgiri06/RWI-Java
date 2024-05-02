//Rotating an Array

public class RotatingArray {
    public static void main(String[] args) {
        int array[] = {5, 6, 8, 56, 45, 78, 12, 23, 56};

        //Print Original Array
        for (int x : array)
            System.out.print(x+", ");
        System.out.println(" ");

        int temp = array[0];

        for (int i = 1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length-1] = temp;

        //Print Rotated Array
        for (int x : array)
            System.out.print(x+", ");
        System.out.println(" ");
    }
}
