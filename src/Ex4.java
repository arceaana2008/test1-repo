import java.util.Scanner;

public class Ex4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu primul numar: ");
        int numar1 = scanner.nextInt();

        System.out.println("Introdu al doilea numar: ");
        int numar2 = scanner.nextInt();

        if (numar1 > numar2) {
            System.out.println(numar1 + "este mai mare.");
            System.out.println(numar2 + "este mai mic.");
        }
        else if (numar1 < numar2) {
            System.out.println(numar2 + "este mai mare.");
            System.out.println(numar1 + "este mai mic.");
        }
        else {
            System.out.println("Cele doua numere sunt egale.");
        }
    }
}
