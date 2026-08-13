public class Ex18 {
    static void main(String[] args) {
        int[] numbers = {10, 25, 7, 40, 15};
        int minim = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minim) {
                minim = numbers[i];
            }
            System.out.println("Elementul cu valoarea cea mai mica este: " + minim);
        }
    }
}
