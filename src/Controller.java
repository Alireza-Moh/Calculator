import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    //Declare numbers to be able to store user input temporarily
    private double nr1;
    private double nr2;
    private double sum;

    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private Button btnPlus;
    @FXML
    private Button btnMinus;
    @FXML
    private Text result;

    //When the minus button is pressed
    @FXML
    void btnPMinusAction(ActionEvent event) {
        nr1 = Double.parseDouble(textField1.getText());   //Get the user input and cast the input to double
        nr2 = Double.parseDouble(textField2.getText());   //Get the user input and cast the input to double


        sum = nr1 - nr2;   //add up the numbers (user input) to get the result

        result.setText("Sum: " + sum);
    }

    //When the plus button is pressed
    @FXML
    void btnPlusAction(ActionEvent event) {
        nr1 = Double.parseDouble(textField1.getText());
        nr2 = Double.parseDouble(textField2.getText());

        sum = nr1 + nr2;

        result.setText("Sum: " + sum);
    }

    //When the Clear button is pressed
    @FXML
    public void btnDelete(ActionEvent actionEvent) {
        textField1.clear();   //The content of the text field will be deleted
        textField2.clear();   //The content of the text field will be deleted
        result.setText("");
    }
}
