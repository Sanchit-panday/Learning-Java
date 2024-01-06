import java.util.Scanner;
import java.util.regex.Pattern;

class first {
    public static void main(String[] args) {
        // check if give number is integer or not
        Scanner S = new Scanner(System.in);
        System.out.print("\nEnter :");
        Pattern pattern = Pattern.compile("[A-Za-z]*");
        Pattern close = Pattern.compile("close");
        int sum = 0;
        while (!S.hasNext(close)) {
            if (S.hasNext(pattern)) {
                System.out.println("You have entered a String: " + S.next());
                continue;
            }
            else if (S.hasNextInt()) {
                sum += S.nextInt();
                System.out.println("Current Sum: " + sum);
            }
            else{
                System.out.println("try again!");
            }
        }
        S.close();
        System.out.println("\nScanner closed");
        System.out.println("Exit Program");
        System.exit(0);
        S.close();
    }
}