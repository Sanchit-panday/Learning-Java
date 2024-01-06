import java.util.Scanner;

public class l5 {
    public static void main(String[] args) {
        int a = 1;
        // difference between while and do-while loop
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        do {
            System.out.println(a);
        } while (a<limit);
        
    }
}
