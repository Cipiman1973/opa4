import java.util.Scanner;

public class dvojka {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Zadejte jmeno");
        String jmeno = scan.nextLine();

        StringBuilder sb = new StringBuilder(jmeno);


        System.out.println("jmeno opacne je : ");
        System.out.println(sb.reverse().toString());
        //nebo by to šlo udělat pres charAt() a vypsat to pozadu
    }
}