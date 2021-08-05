package Shapes;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.*;
import javafx.scene.shape.Line;
import javafx.scene.Group;
import javafx.scene.text.Text;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.CYAN);
        Stage stage = new Stage();

        /* Text to scene */
        Text text = new Text();
        text.setText("WHOOOOOA!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.LIMEGREEN);
        root.getChildren().add(text);

        /* Line to scene */
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.8);
        line.setRotate(45);
        root.getChildren().add(line);

        /* Rectangle to scene */
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        rectangle.setRotate(45);
        root.getChildren().add(rectangle);

        /* Polygon to scene */
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(200.0, 200.0,
                                    300.0, 300.0,
                                    200.0, 300.0
        );
        triangle.setFill(Color.YELLOW);
        root.getChildren().add(triangle);


        /* Circle to scene */
        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);
        root.getChildren().add(circle);

        /* Image to scene */
        String imageUrl = "file:///C://Users//admin//IdeaProjects//HelloFX//src//Shapes//pizza1.jpg";
        Image image = new Image(imageUrl);
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }
}
