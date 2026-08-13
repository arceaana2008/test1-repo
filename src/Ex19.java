import java.util.Scanner;

public class Ex19 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Apasa literele: R, G, V: ");
        char leter = scanner.next().charAt(0);
        switch (leter) {
            case 'R':
                System.out.println("Rosu");
                break;
            case 'G':
                System.out.println("Galben");
                break;
            case 'V':
                System.out.println("Verde");
                break;
            default:
                System.out.println("Litera invalida");
        }
    }
}
