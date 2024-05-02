//Inserting an Element

public class InsertElement {
    public static void main(String[] args) {
        int []array = new int[6];
        array[0] = 15;
        array[1] = 45;
        array[2] = 23;
        array[3] = 25;
        array[4] = 30;

        int n = 5;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(" ");
        

        int j = 65;
        int index = 2;
        for (int i = n; i > index; i--)
            array[i] = array[i-1];
        array[index] = j;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(" ");
    }
}
