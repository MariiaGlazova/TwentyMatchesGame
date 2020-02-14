public class Output {

    static void start() {
        System.out.println("Welcome to this game!");
    }

    static void computerTurn(int matches) {
        System.out.println("Computer's turn, it peeks " + matches + " matches.");
    }

    static void playerTurn() {
        System.out.println("Your turn. Enter the number of matches.");
    }

    static void matchesNumber(int matches) {
        System.out.println("There're " + matches + " matches on the table.");
    }

    static void defeat() {
        System.out.println("There's only one match on the table.");
        System.out.println("You lose.");
    }

    static void incorrectInput() {
        System.out.println("Incorrect input. Try again.");
    }
}
