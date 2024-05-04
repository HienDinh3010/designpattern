package design.asd.course.pattern.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class LineCountInputStreamMain {
    public static void main(String[] args) {
        int character;
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        try {
            LineCountInputStream inputStream =
                    new LineCountInputStream(
                      new ToUppercaseInputStream(
                              new BufferedInputStream(
                                      new FileInputStream(
                                              rootPath + "/input.txt"
                                      )
                              )
                      )
                    );

            while ((character = inputStream.read()) != -1) {
                System.out.println((char) character);
            }
            System.out.println("");
            System.out.println("This file contains " + inputStream.getLineCount() + " lines.");
            inputStream.close();
        } catch (Exception e) {

        }
    }
}
