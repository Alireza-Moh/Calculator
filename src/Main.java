import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/*
 * @author: Alireza
 * Program: A simple calculator
 * Date: 20-12-2020
 */


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("calculatorLayout.fxml"));   //Load the fxml file
        stage.setTitle("Calculator");
        stage.setScene(new Scene(root, 550, 350));
        stage.setResizable(false);
        stage.show();
    }
}
