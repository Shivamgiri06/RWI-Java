public class StringObjrct {
    public static void main(String[] args) {
        // Method 1: Take String class, str1 as reference of object and java program as literal
        String str1 = "Java Program";
        System.out.println(str1);

        //Mehod 2: Take String class, str2 as reference and creating new object and String("JAVA") is constructor which contain literal string.
        String str2 = new String("JAVA");
        System.out.println(str2);

        //Method 3: Take String class, str3 as reference and creating new object and String(c) is constructor which contain array variable.
        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c);
        System.out.println(str3);

        //Method 4: Take String class, str4 as reference and creating new object and String(b) is constructor which contain array variable.
        byte b[] = {65, 66, 67, 68};
        String str4 = new String(b);

        //Print
        System.out.println(str4);
    }
}
