package design.asd.course.pattern.state.gamestatepattern;

public class Application {
    public static void main(String[] args) {
        Game game = new Game(0);
        FirstLevel firstLevel = new FirstLevel(game);
        game.setGameState(firstLevel);
        game.play();
        game.play();
        game.play();
        game.play();
        game.play();
    }
}
