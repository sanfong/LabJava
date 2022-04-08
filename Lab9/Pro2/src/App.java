import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TextField temp = new TextField(String.valueOf((int)(Math.random() * 2)));
                temp.setAlignment(Pos.CENTER);
                pane.add(temp, j, i);
            }
        }
        
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("Program 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
