package design.asd.course.pattern.state.gamestatepattern;

public class SecondAndHalfLevel extends GameState {

    public SecondAndHalfLevel(Game game) {
        super(game);
    }

    @Override
    public void addPoints(int newPoints) {
        game.setTotalPoints(game.getTotalPoints() + newPoints);
        checkForUpgrade();
    }

    @Override
    public void checkForUpgrade() {
        if (game.getTotalPoints() > 20) {
            GameState thirdLevel = new ThirdLevel(game);
            game.setGameState(thirdLevel);
            game.setTotalPoints(game.getTotalPoints() + 2);
        }
    }

    @Override
    public float getLevel() {
        return 2.5f;
    }
}
