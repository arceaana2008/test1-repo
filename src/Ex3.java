import java.util.Scanner;

public class Ex3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu al doilea numar: ");
        int numar1 = scanner.nextInt();

        System.out.println("Introdu al doilea numar: ");
        int numar2 = scanner.nextInt();

        System.out.println("Adunarea: " + (numar1 + numar2));
        System.out.println("Scaderea: " + (numar1 - numar2));
        System.out.println("Inmultirea: " + (numar1 * numar2));
        System.out.println("Inpartirea: " + (numar1 / numar2));
        System.out.println("Restul impartirii: " + (numar1 % numar2));
    }
}
