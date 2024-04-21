package design.asd.course.pattern.state.gamestatepattern;

public class FirstLevel extends GameState {

    public FirstLevel(Game game) {
        super(game);
    }

    @Override
    public void addPoints(int newPoints) {
        game.setTotalPoints(game.getTotalPoints() + newPoints);
        checkForUpgrade();
    }

    @Override
    public void checkForUpgrade() {
        if (game.getTotalPoints() > 10) {
            GameState secondLevel = new SecondLevel(game);
            game.setGameState(secondLevel);
            game.setTotalPoints(game.getTotalPoints() + 1);
        }
    }

    @Override
    public float getLevel() {
        return 1;
    }
}
