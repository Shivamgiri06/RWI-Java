
class StringPractice {
    public static void main(String[] args) {
        //Method 1 of creating String
        String str1 = "Java Program";
        System.out.println(str1);

        //Method 2 of creating String
        String str2 = new String("JAVA");
        System.out.println(str2);

        //Method 3 of creating String
        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c, 1, 3);
        System.out.println(str3);

        //Method 4 of creating String
        byte b[] = {65, 66, 67, 68};
        String str4 = new String(b, 1, 2);
        System.out.println(str4);

    }
}