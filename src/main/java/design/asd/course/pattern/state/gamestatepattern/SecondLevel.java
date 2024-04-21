package design.asd.course.pattern.state.gamestatepattern;

public class SecondLevel extends GameState {
    public SecondLevel(Game game) {
        super(game);
    }

    @Override
    public void addPoints(int newPoints) {
        game.setTotalPoints(game.getTotalPoints() + 2 * newPoints);
        checkForUpgrade();
    }

    @Override
    public void checkForUpgrade() {
        if (game.getTotalPoints() >= 15) {
            GameState secondAndHalfLevel = new SecondAndHalfLevel(game);
            game.setGameState(secondAndHalfLevel);
            game.setTotalPoints(game.getTotalPoints() + 1);
        }
    }

    @Override
    public float getLevel() {
        return 2;
    }
}
