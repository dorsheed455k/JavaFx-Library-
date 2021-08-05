package TextField;

import javafx.fxml.FXML;

import java.awt.*;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Button myButton;

    int age;

    public void submit(ActionEvent event) {
        try {
            age = Integer.parseInt(myTextField.getText());
           // System.out.println(age);
            if (age >= 18) {
                myLabel.setText("You are now signed up!");
            } else {
                myLabel.setText("You must be 18+");
            }
        } catch (NumberFormatException e) {
           // System.out.println("Enter numbers only please");
            myLabel.setText("Enter only numbers please");
        } catch (Exception e) {
          //  System.out.println(e);
            myLabel.setText("error");
        }
    }

}
