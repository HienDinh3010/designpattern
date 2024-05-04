package design.asd.course.pattern.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferInputStreamMain {
    public static void main(String[] args) {
        int character;

        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        try {
            InputStream inputStream =
                    new BufferedInputStream(new FileInputStream(rootPath + "/input.txt"));

            while ((inputStream.read()) != -1) {
                character = inputStream.read();
                System.out.print((char) character);
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
