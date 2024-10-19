public class Main7 {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        String content = fileReader.readFile("path/to/file.txt");
        System.out.println(content);
    }
}

class FileReader {
    public String readFile(String filePath) {
        return "file content";
    }
}
