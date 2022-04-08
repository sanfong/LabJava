import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class FanPane extends Pane {
    private double speedAngle = 15;
    private Timeline fan;

    public FanPane() {
        setPadding(new Insets(10, 10, 10, 10));
        
        Circle c = new Circle(125, 115, 100); // x y r
        c.setStroke(Color.BLACK);
        c.setFill(Color.WHITE);
        c.centerXProperty().bind(widthProperty().divide(2));
        c.centerYProperty().bind(heightProperty().divide(2));
        c.radiusProperty().bind(heightProperty().divide(2).multiply(.90));
        getChildren().add(c);

        double angle = 90;
		for (int i = 0; i < 4; i++) {
			Arc arc = new Arc(125, 115, 90, 90, angle, 50); // x y rx ry angle len
            arc.centerXProperty().bind(widthProperty().divide(2));
			arc.centerYProperty().bind(heightProperty().divide(2));
			arc.radiusXProperty().bind(c.radiusProperty().multiply(.90));
			arc.radiusYProperty().bind(c.radiusProperty().multiply(.90));
			arc.setFill(Color.BLACK);
			arc.setType(ArcType.ROUND); 
			getChildren().add(arc);
			angle += 90;
		}

        fan = new Timeline(new KeyFrame(Duration.millis(50), e -> spinFan()));
        fan.setCycleCount(Timeline.INDEFINITE);
        fan.play();
    }

    protected void spinFan() {
		for (int i = 1; i < getChildren().size(); i++) {
			Arc a = (Arc)getChildren().get(i);
			a.setStartAngle(a.getStartAngle() + speedAngle);
		}
	}

    public void pause() {
        fan.pause();
    }

    public void resume() {
        fan.play();
    }

    public void reverse() {
        speedAngle *= -1;
    }

    public double getSpeedAngle() {
        return speedAngle;
    }

    public void setSpeedAngle(double speedAngle) {
        this.speedAngle = speedAngle;
    }
}
