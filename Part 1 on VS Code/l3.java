import java.util.Scanner;
import java.util.regex.Pattern;
import java.lang.String;
import java.util.Locale;

// string
public class l3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Sanchit";
        String str2 = new String("Pandey");
        String trimmable = " t r i m ";
        String strippable = "  s t r i p  ";
        Locale English = new Locale("en", "US");
        System.out.println("String:" + str + " method_length:" + str.length());
        System.out.println("String:" + str + " method_toLowerCase:" + str.toLowerCase(English));
        System.out.println("String:" + str + " method_toUpperCase:" + str.toUpperCase(English));
        System.out.println("String:" + trimmable + " method_trim:" + trimmable.trim() + ".(endOfString)");
        System.out.println("String:" + strippable + " method_trim:" + strippable.trim() + ".(endOfString)");
        System.out.println("String:" + strippable + " method_strip:" + strippable.strip() + ".(endOfString)");
        System.out.println("String:" + strippable + " method_stripLeading:" + strippable.stripLeading() + ".(endOfString)");
        System.out.println("String:" + strippable + " method_stripTrailing:" + strippable.stripTrailing() + ".(endOfString)");
        System.out.println("String:" + str + " method_substring(2):" + str.substring(2));
        System.out.println("String:" + str + " method_substring(2,4):" + str.substring(2,4));
        System.out.println("String:" + str + " method_replace(\'S\', \'P\'):" + str.replace('S', 'P'));
        System.out.println("String:" + str + " method_startsWith(\"S\"):" + str.startsWith("S"));
        System.out.println("String:" + str + " method_startsWith(\"Sam\"):" + str.startsWith("Sam"));
        System.out.println("String:" + str + " method_endsWith(\"t\"):" + str.endsWith("t"));
        System.out.println("String:" + str + " method_endsWith(\"it\"):" + str.endsWith("it"));
        System.out.println("String:" + str2 + " method_charAt(2):" + str2.charAt(2));
        System.out.println("String:" + str2 + " method_indexOf(\"n\"):" + str2.indexOf("n"));
        System.out.println("String:" + str2 + " method_indexOf(\"n\", 3):" + str2.indexOf("n", 3));
        System.out.println("String:" + str2 + " method_lastIndexOf(\"n\"):" + str2.lastIndexOf("n"));
        System.out.println("String:" + str2 + " method_lastIndexOf(\"n\", 3):" + str2.lastIndexOf("n", 3));
        System.out.println("String:" + str2 + " method_equals(\"Pandey\"):" + str2.equals("Pandey"));
        System.out.println("String:" + str2 + " method_equalsIgnoreCase(\"PANDEY\"):" + str2.equalsIgnoreCase(str2.toUpperCase()));
        System.out.println("String:" + str2 + " method_equalsIgnoreCase(\"pandey\"):" + str2.equalsIgnoreCase(str2.toLowerCase()));    }
}