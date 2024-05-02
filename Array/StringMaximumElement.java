//Finding the Maximum Element.

public class StringMaximumElement {
    public static void main(String[] args) {
        int array[] = {42, 78, 12, 23, 45};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }
        System.out.println("The Maximum Number is: "+max);
    }
}
