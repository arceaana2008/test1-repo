import java.util.Scanner;

public class Ex2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu primul numar: ");
        int numar1 = scanner.nextInt();

        System.out.println("Introdu al doilea numar: ");
        int numar2 = scanner.nextInt();
        int rezultat = numar1 * numar2;

        System.out.println("Rezultatul inmultirii este: " + rezultat);
    }
}
