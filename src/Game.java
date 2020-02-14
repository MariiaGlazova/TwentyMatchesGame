public class Game {


    private int matchesLeft;
    private Player player;
    private Computer computer;

    Game() {
        matchesLeft = Const.GENERAL_MATCHES;
        player = new Player();
        computer = new Computer();
    }

    public void start() {
        Output.start();
        computerInform();
        play();
    }

    private void playerInform() {
        Output.playerTurn();
        matchesLeft = player.move(matchesLeft);
        Output.matchesNumber(matchesLeft);
    }

    private void computerInform() {
        Output.computerTurn(matchesLeft - computer.move(matchesLeft));
        matchesLeft = computer.move(matchesLeft);
        Output.matchesNumber(matchesLeft);
    }

    private void play() {
        while (matchesLeft != 1) {
            playerInform();
            computerInform();
        }
        Output.defeat();
    }


}
