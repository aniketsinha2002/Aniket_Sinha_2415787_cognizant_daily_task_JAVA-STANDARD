import java.util.Scanner;

interface Game {
    void start();
}

class FootballGame implements Game {
    public void start() {
        System.out.println("Starting a football match!");
    }
}

class CricketGame implements Game {
    public void start() {
        System.out.println("Starting a cricket match!");
    }
}

class TennisGame implements Game {
    public void start() {
        System.out.println("Starting a tennis match!");
    }
}

public class SportSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a game to play:\n1. Football\n2. Cricket\n3. Tennis");
        int choice = scanner.nextInt();

        Game game;
        if (choice == 1) {
            game = new FootballGame();
        } else if (choice == 2) {
            game = new CricketGame();
        } else if (choice == 3) {
            game = new TennisGame();
        } else {
            System.out.println("Invalid selection. Please choose a valid option.");
            scanner.close();
            return;
        }

        System.out.println("\nLet's play!");
        game.start();

        scanner.close();
    }
}
