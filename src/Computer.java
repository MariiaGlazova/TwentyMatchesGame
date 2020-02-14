public class Computer {

    public int move(int matchesLeft) {
        if (matchesLeft % 4 == 0) {
            return matchesLeft - Const.THREE_MATCHES;
        }
        return matchesLeft - ((matchesLeft % 4) - Const.ONE_MATCH);
    }
}
