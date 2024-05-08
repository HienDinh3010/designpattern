package frameworkdesign.usingjavafx;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button();
        button.setText("Say 'Hello World'");
        button.relocate(50, 50);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello World");
            }
        });
        Pane pane = new Pane();
        pane.getChildren().add(button);

        Scene scene = new Scene(pane, 230, 150);
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
