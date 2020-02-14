import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    private Scanner scanner;

    Player() {
        scanner = new Scanner(System.in);
    }

    public int move(int matchesLeft) {
        int matchesAfterMoving;
        do {
            matchesAfterMoving = tryToMove(matchesLeft);
        }
        while (matchesAfterMoving == -1);
        return matchesAfterMoving;

    }

    private int tryToMove(int matchesLeft) {
        try {
            int matchesNum = scanner.nextInt();
            if (!isCorrectNumberOfMatches(matchesNum)) {
                throw new InputMismatchException();
            }
            return matchesLeft - matchesNum;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            Output.incorrectInput();
            return -1;
        }
    }

    private boolean isCorrectNumberOfMatches(int matchesNum) {
        return matchesNum == Const.ONE_MATCH || matchesNum == Const.TWO_MATCHES
                || matchesNum == Const.THREE_MATCHES;
    }

}
