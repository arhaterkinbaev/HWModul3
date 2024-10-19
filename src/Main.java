import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logError("Ошибка при подключении к базе данных!");
        logger.logWarning("Пользователь ввел некорректные данные.");
        logger.logInfo("Пользователь успешно вошел в систему.");

        // To keep the console window open (similar to Console.ReadKey() in C#)
        new Scanner(System.in).nextLine();
    }

    static class Logger {
        public void log(String level, String message) {
            System.out.println(level + ": " + message);
        }

        public void logError(String message) {
            log("ERROR", message);
        }

        public void logWarning(String message) {
            log("WARNING", message);
        }

        public void logInfo(String message) {
            log("INFO", message);
        }
    }
}
