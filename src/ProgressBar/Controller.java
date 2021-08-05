package ProgressBar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label myLabel;
    @FXML
    private ProgressBar myProgressBar;
    @FXML
    private Button myButton;

    // The BigDecimal class gives its user complete control over rounding behaviour
    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       // myProgressBar.setStyle("-fx-accent: red;");
        myProgressBar.setStyle("-fx-accent: #00FF00;");

    }

    public void increaseProgress() {

        if (progress.doubleValue() < 1) {
            progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
            System.out.println(progress.doubleValue());
            myProgressBar.setProgress(progress.doubleValue());
            //   myLabel.setText(String.valueOf(progress*100) + "%");
            myLabel.setText(Integer.toString((int) Math.round(progress.doubleValue() * 100)) + "%");
        }
    }
}
