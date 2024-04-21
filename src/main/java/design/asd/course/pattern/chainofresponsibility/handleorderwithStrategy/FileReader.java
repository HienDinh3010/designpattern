package design.asd.course.pattern.chainofresponsibility.handleorderwithStrategy;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader {
    public String getStringFromFile(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        String content = readContentFromFile(inputStream);
        return content;
    }

    private String readContentFromFile(InputStream inputStream) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder = stringBuilder.append(line).append("/n");
            }

        } catch(Exception e) {
            System.out.println("Error reading from inputStream " + e);
        }
        return stringBuilder.toString();
    }
}
