public class Main3 {
    public static void main(String[] args) {
        int[] numbers = { 1, -2, 3, 0, 5 };
        processNumbers(numbers);
    }

    public static void processNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }

        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }
}
