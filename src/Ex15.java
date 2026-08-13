import java.util.Arrays;

public class Ex15 {
    static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array-ul initial: " + Arrays.toString(numbers));
        numbers[4] = 100;
        System.out.println("Array-ul modificat: " + Arrays.toString(numbers));
    }
}
