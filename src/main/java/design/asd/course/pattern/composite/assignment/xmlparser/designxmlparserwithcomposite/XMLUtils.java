package design.asd.course.pattern.composite.assignment.xmlparser.designxmlparserwithcomposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLUtils {

    public static String xmlAttributesRegex = "<([^<>]+)>([^<>]+)</([^<>]+)>";
    public static String validXmlAttributeRegex = "^\\s*<[^<>]+>[^<>]+</[^<>]+>\\s*(<[^<>]+>[^<>]+</[^<>]+>\\s*)*$";

    public static String openTagRegex = "<([^\\s>]+)>";

    private static String xmlNodeRegex = "<([^<>]+)>([^<>]+)</([^<>]+)>";

    public static String removeParentNode(String xmlString) {
        String tagName = getParentNodeName(xmlString);
        String regex = "^<" + tagName +">\\s*|\\s*</" + tagName + ">$";
        if (!tagName.isEmpty()) {
            String newXmlString = xmlString.replaceAll(regex, "");
            System.out.println("newXmlString: " + newXmlString);
            return newXmlString;
        }
        return null;
    }

    public static String getParentNodeName(String xmlString) {
        Pattern pattern = Pattern.compile(openTagRegex);
        Matcher matcher = pattern.matcher(xmlString);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    //private static final String xmlAttributesRegex2 = "^\\s*<[^<>]+>[^<>]+</[^<>]+>\\s*(<[^<>]+>[^<>]+</[^<>]+>\\s*)*$";
    public static boolean isXMLAttribute(String xmlString) {
        if (xmlString.matches(validXmlAttributeRegex)) {
            return true;
        }
        return false;
    }
}
