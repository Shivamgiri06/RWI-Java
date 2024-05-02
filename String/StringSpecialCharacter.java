//Remove special characters from the string.

public class StringSpecialCharacter {
    public static void main(String[] args) {
        String str = "a@b$c%d&e";
        System.out.println(str.replaceAll("[^0-9 A-Z a-z]", ""));
    }
}
