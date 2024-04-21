package design.asd.course.pattern.state.gamestatepattern;

public abstract class GameState {

    protected Game game;

    public GameState(Game game) {
        this.game = game;
    }

    public abstract void addPoints(int newPoints);

    public abstract void checkForUpgrade();

    public abstract float getLevel();
}
