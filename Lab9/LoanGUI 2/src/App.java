import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    TextField amountField = new TextField();
    TextField yearsField = new TextField();
    Button showButton = new Button("Show Table");
    TextArea outputArea = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(new Label("Loan Amount"), amountField, new Label("Number of Years"), yearsField, showButton);
        
        amountField.setPrefColumnCount(7);
        yearsField.setPrefColumnCount(2);
        outputArea.setEditable(false);
        showButton.setOnAction(this::showTable);
        
        BorderPane pane = new BorderPane();
        pane.setTop(hBox);
        pane.setCenter(outputArea);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Loan GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    void showTable(ActionEvent event) {
        Double loan;
        Integer years;
        try {
            loan = Double.parseDouble(amountField.getText());
            years = Integer.parseInt(yearsField.getText());
        } catch (Exception e) {
            return;
        }
        String output = "Interest Rate       Monthly Payment          Total Payment\n";
        for (Double i = 5.0; i <= 8; i += 0.25) {
            Double pay = payPerMonth(loan, years, i);
            output += String.format("%-24.2f%-32.2f%-8.2f\n", i, pay, pay * 12 * years);
        }
        outputArea.setText(output);
    }

    static double payPerMonth(double loan, int years, double interestRate) {
        double r = interestRate / 1200;
        int n = years * 12;
        return (loan * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
