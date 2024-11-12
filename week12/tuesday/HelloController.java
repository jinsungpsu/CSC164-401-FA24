package com.example.week12javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    private ImageView espnImage;

    @FXML
    private Slider leftSlider;

    @FXML
    private HBox topAreaHBox;

    @FXML
    private TextField textInput;

    @FXML
    private Rectangle blueRectangle;

    @FXML
    private Button button;

    @FXML
    void leftSliderOnDragReleasedHandler(MouseEvent event) {
        //System.out.println(event);
        System.out.println(leftSlider.getValue());
        System.out.println("The text in that field is : " + textInput.getText());
        blueRectangle.setX(leftSlider.getValue());
    }

    @FXML
    void moveRectangle(ActionEvent event) {
        // teleport the rectangle
        double newXCoordinate = Double.parseDouble(textInput.getText());
        blueRectangle.setX(newXCoordinate);
    }

    public void initialize() {
        topAreaHBox.setAlignment(Pos.BOTTOM_RIGHT);
        System.out.println("Is this working?");
    }

}
