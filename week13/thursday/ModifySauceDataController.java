package com.example.hotsauceapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ModifySauceDataController {

    @FXML
    private TextField brandInputTextField;

    @FXML
    private TextField caloriesInputTextField;

    @FXML
    private CheckBox lethalInputTextField;

    @FXML
    private TextField nameInputTextField;

    @FXML
    void cancelButtonHandler(ActionEvent event) {
        goBackToMainScene();
    }

    @FXML
    void saveButtonHandler(ActionEvent event) {
        String brand = brandInputTextField.getText();
        String name = nameInputTextField.getText();

        int calories = Integer.parseInt(caloriesInputTextField.getText());
        boolean lethal = lethalInputTextField.isSelected();

        HotSauce newHotSauce = new HotSauce(brand, name, calories, lethal);

        HotSauceApp.hotSauceInventory.remove(HotSauceApp.selectedSauce);
        HotSauceApp.hotSauceInventory.add(newHotSauce);

        goBackToMainScene();
    }

    private void goBackToMainScene() {
        Stage thisCurrentstage = (Stage)nameInputTextField.getScene().getWindow();
        HotSauceUtilities.loadScene("hello-view.fxml", thisCurrentstage);
    }

    public void initialize() {
        nameInputTextField.setText(HotSauceApp.selectedSauce.getName());
        brandInputTextField.setText(HotSauceApp.selectedSauce.getBrand());
        caloriesInputTextField.setText(String.valueOf(HotSauceApp.selectedSauce.getCalories()));
        lethalInputTextField.setSelected(HotSauceApp.selectedSauce.isLethal());
    }

}
