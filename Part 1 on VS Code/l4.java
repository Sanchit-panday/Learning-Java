import java.io.Console;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class l4 {

    public static void HelloWorld(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) throws IOException {
        // HelloWorld("print");

        Scanner scanner = new Scanner(System.in);
        // int age = scanner.nextInt();
        // switch (age) {
        // case 0 -> {
        // System.out.printf("0");
        // }
        // case 1 -> System.out.printf("1");
        // case 2 -> System.out.printf("2");
        // default -> System.out.printf("unexpected");
        // }

        // // scanner.close();
        // int m1, m2, m3;
        // // marks are out of 100
        // int total = sum(m1, m2, m3);
        // boolean p1, p2, p3;
        // int val = switch (total) {
        // case 2 :
        // yield 1;
        // case 3 :
        // yield 2;
        // default:
        // throw new IllegalArgumentException("Unexpected value: " + total);
        // };
        // char ch = scanner.next().charAt(0);
        // System.out.println((int)ch);
        // System.out.print("Enter a character: ");
        // // Read the char
        // char ch = (char) System.in.read();

        // System.out.print("\n You pressed: " + ch);
        Console c = System.console();
        Reader r = c.reader();
        try {
            int num = r.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
