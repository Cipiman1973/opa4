import java.util.Scanner;

public class palindrom {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Zadejte slovo pro overeni zda je to palindrom");
        String a = scan.nextLine();

        String b = "";

        int n = a.length();

        for (int i = n - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }

        if (a.equalsIgnoreCase(b)) {
            System.out.println("Je to palindrom");
        } else {
            System.out.println("Neni to palindrom");
        }
    }
}