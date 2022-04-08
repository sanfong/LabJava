import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        CarPane car = new CarPane();
        car.setOnMousePressed(e -> car.pause());
		car.setOnMouseReleased(e -> car.play());
        car.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                car.increaseSpeed();
			}
			else if (e.getCode() == KeyCode.DOWN) {
                car.decreaseSpeed();
			}
		});
        
        Scene scene = new Scene(car, 600, 100);
        primaryStage.setTitle("Car");
        primaryStage.setScene(scene);
        primaryStage.show();
        car.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
