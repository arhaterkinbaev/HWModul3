public class Main5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = divide(a, b);
        System.out.println("Результат: " + result);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return 0; // Handling division by zero
        }
        return a / b;
    }
}
