package design.asd.course.pattern.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ToUppercaseInputStreamMain {
    public static void main(String[] args) {
        int character;
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        try {
            InputStream inputStream =
                    new ToUppercaseInputStream(new BufferedInputStream(
                            new FileInputStream(rootPath + "/input.txt")
                    ));
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
