public class Main8 {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport();
    }
}

class ReportGenerator {
    public void generateReport() {
        System.out.println("Отчет сгенерирован:");
        System.out.println("--------------------");
        System.out.println("Данные 1: ...");
        System.out.println("Данные 2: ...");
        System.out.println("Данные 3: ...");
    }
}
