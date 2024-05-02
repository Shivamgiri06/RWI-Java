//Ckeck the number is binary or not.

public class BinaryNumber {
    public static void main(String[] args) {
        int b = 10011010;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]+"));
    }
}
