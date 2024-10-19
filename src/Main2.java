import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Configuration config = new Configuration();

        DatabaseService dbService = new DatabaseService(config);
        dbService.connect();

        EmailService emailService = new EmailService(config);
        emailService.sendEmail("user@example.com", "Тема письма", "Тело письма");

        Logger logger = new Logger(config);
        logger.logError("Ошибка при отправке письма!");
        logger.logWarning("Некорректный адрес получателя.");
        logger.logInfo("Письмо успешно отправлено.");

        // To keep the console window open (similar to Console.ReadKey() in C#)
        new Scanner(System.in).nextLine();
    }

    static class Configuration {
        private String connectionString = "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";

        public String getConnectionString() {
            return connectionString;
        }

        public void setConnectionString(String connectionString) {
            this.connectionString = connectionString;
        }
    }

    static class Logger {
        private Configuration config;

        public Logger(Configuration config) {
            this.config = config;
        }

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

    static class DatabaseService {
        private Configuration config;

        public DatabaseService(Configuration config) {
            this.config = config;
        }

        public void connect() {
            System.out.println("Подключение к базе данных...");
        }
    }

    static class EmailService {
        private Configuration config;

        public EmailService(Configuration config) {
            this.config = config;
        }

        public void sendEmail(String recipient, String subject, String body) {
            System.out.println("Отправка письма на адрес: " + recipient);
        }
    }
}
