import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Let's play: Battleship");
        Label title =
        button = new Button("Click Me");

        button.setOnAction(e -> {
            boolean result = Controller.display("Let's play: Battleship", "Is this your final answer?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    public void handle(ActionEvent event){
        if(event.getSource() == button)
            System.out.println("")

    }

}