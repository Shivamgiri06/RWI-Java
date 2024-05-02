//Searching an Elements

import java.util.Scanner;

public class SearchElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {10, 30, 45, 12, 78};
        int key;
        System.out.print("Enter the element: ");
        key = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("The element is found in index "+i);
                System.exit(0);
            }
        }
        System.out.println("The element is not found in the array!");
    }
}
