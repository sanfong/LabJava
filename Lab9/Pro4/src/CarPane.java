import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class CarPane extends Pane {
    private double x = 0;
    private double y = 100;
    private double radius = 5;
    private Rectangle rectangle;
    private Polygon polygon;
    private Circle wheel1;
    private Circle wheel2;
    private Timeline animation;
    private Translate movement = new Translate(1, 0);

    public CarPane() {
        rectangle = new Rectangle(0, y - 20, 50, 10);
        rectangle.setFill(Color.CYAN);
        polygon = new Polygon(x + 10, y - 20, x + 20, y - 30, x + 30, y - 30, x + 40, y - 20);
        polygon.setFill(Color.BLUE);
        wheel1 = new Circle(x + 15, y - 5, radius);
        wheel2 = new Circle(x + 35, y - 5, radius);
        getChildren().addAll(rectangle, polygon, wheel1, wheel2);
        
        animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveCar()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    protected void moveCar() {
        if (x <= getWidth()) {
            rectangle.getTransforms().add(movement);
            polygon.getTransforms().add(movement);
            wheel1.getTransforms().add(movement);
            wheel2.getTransforms().add(movement);
            x += movement.getX();
        } else {
            rectangle.getTransforms().clear();
            polygon.getTransforms().clear();
            wheel1.getTransforms().clear();
            wheel2.getTransforms().clear();
            x = 0;
        }
    }

    public void pause() {
        animation.pause();
    }

    public void play() {
        animation.play();
    }

    public void increaseSpeed() {
        if (animation.getRate() == 0.5) {
            animation.setRate(1);
            play();
        }
        else {
            animation.setRate(animation.getRate() + 1);
        }

    }

    public void decreaseSpeed() {
        if (animation.getRate() == 1 || animation.getRate() == 0.5) {
            pause();
            animation.setRate(0.5);
        }
        else {
            animation.setRate(animation.getRate() > 0 ? animation.getRate() - 1 : 0);
        }
    }
}
