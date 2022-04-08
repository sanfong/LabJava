import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ClockPane clock = new ClockPane((int)(Math.random() * 12), (int)(Math.random() * 31), (int)(Math.random() * 60));
        clock.setSecondHandVisible(false);

        Scene scene = new Scene(clock, 250, 250);
        primaryStage.setTitle("Random Time");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
