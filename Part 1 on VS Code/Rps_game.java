
// Drawing & play Rock, Paper And sccisors
import java.util.random.*;
import java.io.IOException;
import java.util.Scanner;

public class Rps_game {
    static int userp = 0, compp = 0;
    static String creator = "Sanchit";

    public static int winner(int user, int comp) {
        if (comp == user) {
            userp++;
            compp++;
            return 2;
        }
        switch (user) {
            case 1:
                if (comp == 2) {
                    compp++;
                    return 1;
                }
                break;
            case 2:
                if (comp == 3) {
                    compp++;
                    return 1;
                }
                break;
            case 3:
                if (comp == 1) {
                    compp++;
                    return 1;
                }
                break;

            default:
                break;
        }
        userp++;
        return 0;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void clearLines(int numLines) {
        for (int i = 0; i < numLines; i++) {
            System.out.print("\033[1A\033[2K");
        }
    }

    public static void wait(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    static void drawRock() {
        System.out.println("|     .---.       |");
        System.out.println("|    /     \\\\     |");
        System.out.println("|   /  0.0  \\\\    |");
        System.out.println("|  /   \\_/  ) )   |");
        System.out.println("| (           )   |");
        System.out.println("|  `----------'   |");
    }

    static void drawPaper() {
        System.out.println("|      .--------. |");
        System.out.println("|     /  ~ ~ ~  / |");
        System.out.println("|    /  .  .   /  |");
        System.out.println("|   /    >    /   |");
        System.out.println("|  /  ~ ~ ~  /    |");
        System.out.println("| /._______./     |");
    }

    static void drawScissors() {
        System.out.println("|     \\     /     |");
        System.out.println("|      \\   /      |");
        System.out.println("|       \\o/       |");
        System.out.println("|    *///\\\\\\*     |");
        System.out.println("|   *  /  \\  *    |");
        System.out.println("|  *///    \\\\\\*   |");
    }

    static void canvas(String draw) {
        System.out.println("|-----------------|");
        switch (draw) {
            case "Rock":
                drawRock();
                break;
            case "Paper":
                drawPaper();
                break;
            case "Scissors":
                drawScissors();
                break;
            default:
                break;
        }
        System.out.println("|_________________|");
    }

    static void intro() {
        clearScreen();
        wait(1);
        String welcome = "++++ Welcome to ROCK, PAPER & SCISSORS GAME! ++++ \nInitalizing....\n";
        for (String word : welcome.split(" ")) {
            System.out.print(word + " ");
            wait(1);
        }
        System.out.println();
        String rps = new String("Rock Paper Scissors");
        for (String word : rps.split(" ")) {
            System.out.println("Loading " + word + " ->");
            canvas(word);
            wait(1);
            clearLines(9);
        }
        System.out.println("Ready!!");
        wait(2);
        clearScreen();
    }

    static void scoreBoard() {
        System.out.println("====Rock, Paper & Scissors Game====");
        System.out.printf("======You: %02d Vs Computer: %02d======\n", userp, compp);
    }

    static void menu() {
        scoreBoard();
        System.out.println("||--------------||");
        System.out.println("|| 1-> ROCK     ||");
        System.out.println("|| 2-> PAPER    ||");
        System.out.println("|| 3-> SCISSORS ||");
        System.out.println("|| 4-> Exit     ||");
        System.out.println("||--------------||");
        wait(1);
        System.out.print("Select your card: ");

    }

    static void play() {
        Scanner scanner = new Scanner(System.in);
        int user = 1;

        while (user != 4) {
            clearScreen();
            menu();
            user = scanner.nextInt();
            System.out.println();
            switch (user) {
                case 1:
                    System.out.println("You selected-> Rock");
                    canvas("Rock");
                    break;
                case 2:
                    System.out.println("You selected-> Paper");
                    canvas("Paper");
                    break;
                case 3:
                    System.out.println("You selected-> Scissors");
                    canvas("Scissors");
                    break;
                case 4:
                    continue;
                default:
                    System.out.println("Press a valid key!");
                    wait(2);
                    continue;
            }

            int comp = (int) (Math.random() * (3) + 1);
            switch (comp) {
                case 1:
                    System.out.println("Computer selected-> Rock");
                    canvas("Rock");
                    break;
                case 2:
                    System.out.println("Computer selected-> Paper");
                    canvas("Paper");
                    break;
                case 3:
                    System.out.println("Computer selected-> Scissors");
                    canvas("Scissors");
                    break;
                default:
                    break;
            }

            int b = winner(user, comp);
            String resString = new String("YOU WIN");
            if (b > 0) {
                resString = (b > 1) ? "DRAW" : "YOU LOOSE";
            }
            System.out.println("\n======"+ resString + "======");
            for (int i = 4; i >= 0; i--) {
                System.out.println("Next round in " + i + "sec...");
                wait(1);
                clearLines(1);
            }
        }
        scanner.close();
    }

    static void outro() {
        clearScreen();
        scoreBoard();
        System.out.println("\nThanks for Playing!");
        System.out.println("Created By " + creator);
    }

    public static void main(String[] args) throws IOException {
        intro();
        play();
        outro();
    }
}