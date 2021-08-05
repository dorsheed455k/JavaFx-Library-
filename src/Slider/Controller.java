package Slider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private Slider mySlider;

    int myTemperature;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        myTemperature = (int) mySlider.getValue();
        myLabel.setText(Integer.toString(myTemperature) + " °C");

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                myTemperature = (int) mySlider.getValue();
                myLabel.setText(Integer.toString(myTemperature) + " °C");
            }
        });
    }
}
