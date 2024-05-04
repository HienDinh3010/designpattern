package design.asd.course.pattern.decorator.javaio;


import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Decorator pattern allows to dynamically add new behavior to an existing object.
 */
public class FileInputStreamMain {
    public static void main(String[] args) {
        int character;
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

        try {
            InputStream inputStream = new FileInputStream(rootPath + "/input.txt");
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }

            inputStream.close();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
