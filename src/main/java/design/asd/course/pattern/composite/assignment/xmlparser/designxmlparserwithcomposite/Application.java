package design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        String path = "/Users/hiendinh/Desktop/AlgorithmJourney/src/design/asd/course/pattern/composite/assignment/xmlparser/designxmlparserwithcomposite/resource/sample2.xml";
        String xmlString = "";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                xmlString = xmlString + line.trim();
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        System.out.println(xmlString);

        XMLParser xmlParser = new XMLParser();
        XMLElement xmlElement = xmlParser.parseXML(xmlString);
        System.out.println("XML Nodes:");
        xmlElement.display();
    }
}
