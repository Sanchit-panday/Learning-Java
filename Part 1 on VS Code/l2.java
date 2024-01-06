import java.util.Scanner;
import java.util.regex.Pattern;

public class l2 {
    public static void main(String[] args) {
        // check if given number is an odd or an even number
        Scanner scan = new Scanner(System.in);
        // Pattern close = Pattern.compile("close");
        // while (!scan.hasNext(close)) {
        //     int n = scan.nextInt();
        //     if ((n & 1) == 0) {
        //         System.out.println("Entered Number is Even: " + n);
        //     } else {
        //         System.out.println("Entered Number is Odd: " + n);
        //     }
        // }
        System.out.println(((0b10 & 0b11)<<1)>>1);
        System.out.print("\nEnter the Number: ");
        Byte n = scan.nextByte();
        System.out.println("Negative of that number is: " + ~(n-1));
        // scan.close();
        // System.out.println();
    }
}
