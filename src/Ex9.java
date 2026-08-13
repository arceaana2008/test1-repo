import java.util.Scanner;

public class Ex9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu numarul lunii: ");
            int luna = scanner.nextInt();
            switch (luna) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Iarna");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Primavara");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Vara");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Toamna");
                    break;
                    default:
                        System.out.println("Numarul este invalid. Introdu un numar de la 1 la 12.");
            }
        }
}
