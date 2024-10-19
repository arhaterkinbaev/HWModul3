public class Main4 {
    public static void main(String[] args) {
        int[] numbers = { 1, -2, 3, 0, 5 };
        printPositiveNumbers(numbers);
    }

    public static void printPositiveNumbers(int[] numbers) {
        if (numbers == null) {
            return;
        }

        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }
}
