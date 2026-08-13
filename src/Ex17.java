public class Ex17 {
    static void main(String[] args) {
        int[] numbers = {10, 25, 7, 40, 15};
        int maxim = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxim) {
                maxim = numbers[i];
            }
            System.out.println("Elementul cu valoare cea mai mare este: " + maxim);
        }
    }
}
