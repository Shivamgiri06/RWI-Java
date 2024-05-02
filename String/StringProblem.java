import java.util.Scanner;

public class StringProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Email id: ");
        String email = sc.nextLine();

        int i = email.indexOf("@");
        String Username = email.substring(0, i);
        String Domain = email.substring(i+1, email.length());

        System.out.println("Username: "+Username);
        System.out.println("Domain: "+Domain);
        System.out.println(Domain.startsWith("gmail"));
        sc.close();
    }
}
