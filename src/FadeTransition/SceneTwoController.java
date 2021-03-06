package FadeTransition;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SceneTwoController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        rootPane.setOpacity(0);
        makeFadeInTransition();

    }
    @FXML
    private void handleButtonClick(ActionEvent event) {
        makeFadeOut();
    }

    private void makeFadeOut() {
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(1000));
        fadeTransition.setNode(rootPane);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.setOnFinished(event -> loadNextScene());
        fadeTransition.play();

    }

    public void makeFadeInTransition() {
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(1000));
        fadeTransition.setNode(rootPane);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }

    private void loadNextScene() {

        try {
            Parent secondView = (AnchorPane) FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            Scene newScene = new Scene(secondView);

            Stage curStage = (Stage)rootPane.getScene().getWindow();

            curStage.setScene(newScene);
        } catch (IOException e) {
            Logger.getLogger(SceneOneController.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
