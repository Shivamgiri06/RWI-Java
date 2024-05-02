public class StringSpaceRemove {
    public static void main(String[] args) {
        String str = "Sh  iv       am ";

        System.out.println(str.replaceAll("\\s+", ""));  
        //The \\s+ is used to replace uneven spaces between letters.
    }
}
