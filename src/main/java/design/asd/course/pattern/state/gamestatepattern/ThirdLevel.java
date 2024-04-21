package design.asd.course.pattern.state.gamestatepattern;

public class ThirdLevel extends GameState {
    public ThirdLevel(Game game) {
        super(game);
    }

    @Override
    public void addPoints(int newPoints) {
        game.setTotalPoints(game.getTotalPoints() + 3 * newPoints);
    }

    @Override
    public void checkForUpgrade() {

    }

    @Override
    public float getLevel() {
        return 3;
    }
}
