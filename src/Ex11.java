import java.util.Scanner;

public class Ex11 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un text: ");
        String text = scanner.nextLine();
        System.out.println("Indicele maxim: " + (text.length() - 1));
        System.out.println("Cantitatea de caractere: " + text.length());
    }
}
