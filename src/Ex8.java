import java.util.Scanner;

public class Ex8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu ora: ");
        int ora = scanner.nextInt();
        if (ora >= 0 && ora <= 5) {
            System.out.println("Este noapte.");
        } else if (ora >= 6 && ora <= 11) {
            System.out.println("Este dimineata.");
        } else if (ora >= 12 && ora <= 17) {
            System.out.println("Este dupa-amiaza.");
        } else if (ora >= 18 && ora <= 23) {
            System.out.println("Este seara.");
        }else {
            System.out.println("Ora introdusa este invalida.");
        }
    }
}
