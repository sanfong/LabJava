import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
        FanPane fan = new FanPane();
        Button pause = new Button("Pause");
        Button resume = new Button("Resume");
        Button reverse = new Button("Reverse");
        HBox hor = new HBox(5, pause, resume, reverse);
        Slider slider = new Slider(0, 30, 15);
        slider.setOnMousePressed(me -> fan.setSpeedAngle(slider.getValue()));
        slider.setOnMouseDragged(me -> fan.setSpeedAngle(slider.getValue()));
        hor.setAlignment(Pos.CENTER);
        pane.setTop(hor);
        pane.setCenter(fan);
        pane.setBottom(slider);

        pause.setOnAction(e -> fan.pause());
        resume.setOnAction(e -> fan.resume());
        reverse.setOnAction(e -> fan.reverse());

        Scene scene = new Scene(pane, 250, 260);
        primaryStage.setTitle("Fan");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
