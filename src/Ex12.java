import java.util.Scanner;

public class Ex12 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu varsta. ");
        int varsta = scanner.nextInt();
        if (varsta <= 0 || varsta > 135) {
            System.out.println("Varsta invalida.");
        } else if (varsta < 12) {
            System.out.println("Copil");
        } else if (varsta < 18) {
            System.out.println("Adolescent");
        } else {
            System.out.println("Adult");
        }
    }
}
