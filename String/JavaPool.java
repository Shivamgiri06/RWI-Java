public class JavaPool {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1==str2);
        //Output: True

        String str3 = "Java";
        String str4 = "java";

        System.out.println(str3==str4);
        //Output: False

        String str5 = "Java";
        String str6 = new String("Java");

        System.out.println(str5==str6);
        //Output: False
    }
}
