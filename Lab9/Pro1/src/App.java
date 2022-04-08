import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.add(new ImageView("img/uk.gif"), 0, 0);
        pane.add(new ImageView("img/ca.gif"), 1, 0);
        pane.add(new ImageView("img/china.gif"), 0, 1);
        pane.add(new ImageView("img/us.gif"), 1, 1);
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Program 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
