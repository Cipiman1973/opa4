import java.util.Scanner;

public class zacatek {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("zadejte slovo ");
        String slovo = scan.nextLine();

        System.out.println("zadejte 2 pismena ktera jsou na zacatku zadaneho slova");
        String pismeno = scan.nextLine();

        System.out.println(slovo.startsWith(pismeno));


    }
}