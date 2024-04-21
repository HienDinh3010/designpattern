package design.asd.course.pattern.state.gamestatepattern;

import java.util.Random;

public class Game {

    private int totalPoints;

    private GameState gameState;

    public Game(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public void play() {
        Random random = new Random();
        addPoints(random.nextInt(7));
        System.out.println(this);
    }

    public void addPoints(int newPoints) {
        gameState.addPoints(newPoints);
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    @Override
    public String toString() {
        return "Game{" +
                "totalPoints=" + totalPoints +
                ", level=" + gameState.getLevel() +
                '}';
    }
}
