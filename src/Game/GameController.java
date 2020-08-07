package Game;

public class GameController {
    private GameType gameType;
    private Difficulty difficulty;
    private String turn = "x";
    public static GameController gameController;

    public GameController(String type, String difficulty) {
        if (type.equals("one player")) {
            setGameType(GameType.ONE_PLAYER);
            for (Difficulty dif : Difficulty.values()) {
                if (gameType.toString().equalsIgnoreCase(difficulty)) {
                    setDifficulty(dif);
                }
            }
        }
        if (type.equals("two players")) {
            setGameType(GameType.TWO_PLAYERS);
        }
        gameController = this;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    // methods about turn, getting it and changing it

    public boolean is_x_turn() {
        return turn.equals("x");
    }

    public boolean is_o_turn() {
        return turn.equals("o");
    }

    public void change_turn() {
        turn = turn.equalsIgnoreCase("x") ? "o" : "x";
    }

    // the only thing we actually reset is just the turn and others will remain the same

    public void reset() {
        gameController.turn = "x";
    }


}
