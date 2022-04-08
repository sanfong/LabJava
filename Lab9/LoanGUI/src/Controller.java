import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField loanField;

    @FXML
    private TextField yearField;

    @FXML
    private TextArea outputArea;

    @FXML
    void showTable(ActionEvent event) {
        Double loan;
        Integer years;
        try {
            loan = Double.parseDouble(loanField.getText());
            years = Integer.parseInt(yearField.getText());
        } catch (Exception e) {
            return;
        }
        String output = "Interest Rate    Monthly Payment    Total Payment\n";
        for (Double i = 5.0; i <= 8; i += 0.25) {
            Double pay = payPerMonth(loan, years, i);
            String payFormat = String.format("%.2f", pay);
            output += i + " ".repeat(17 - i.toString().length()) + payFormat
                    + " ".repeat(19 - payFormat.toString().length()) + String.format("%.2f", pay * years * 12) + "\n";
        }
        outputArea.setText(output);
    }

    static double payPerMonth(double loan, int years, double interestRate) {
        double r = interestRate / 1200;
        int n = years * 12;
        return (loan * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }
}