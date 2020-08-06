package Game;

public class GameController {
    private GameType gameType;
    private Difficulty difficulty;

    public GameController(String type, String difficulty) {
        if (type.equals("one player")) {
            setGameType(GameType.ONE_PLAYER);
            if (difficulty.equals("easy")) {
                setDifficulty(Difficulty.EASY);
            } else if (difficulty.equals("hard")) {
                setDifficulty(Difficulty.HARD);
            } else {
                setDifficulty(Difficulty.INSANE);
            }
        }
        if (type.equals("two players")) {
            setGameType(GameType.TWO_PLAYERS);
        }
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

}
