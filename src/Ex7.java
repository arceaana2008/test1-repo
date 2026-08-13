import java.util.Scanner;

public class Ex7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu un numar: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Numarul este par.");
        }
        else {
            System.out.println("Numarul este impar.");
        }
    }
}
