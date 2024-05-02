//Check the number is Hexadecimal Number or not.

public class HexadecimalNumber {
    public static void main(String[] args) {
        String str = "245AF";
        System.out.println(str.matches("[0-9 A-F]+"));
    }
}
