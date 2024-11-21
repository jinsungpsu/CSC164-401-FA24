package com.example.hotsauceapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuSauceViewerController {

    @FXML
    private ListView<HotSauce> hotSauceListView;

    @FXML
    private ToggleButton lethalToggle;

    @FXML
    private TextField brandInputTextField;

    @FXML
    private TextField caloriesInputTextField;

    @FXML
    private CheckBox lethalInputCheckBox;

    @FXML
    private TextField nameInputTextField;

    @FXML
    private Text errorText;

    @FXML
    void modifySauceButtonHandler(ActionEvent event) {
        HotSauceApp.selectedSauce = hotSauceListView.getSelectionModel().getSelectedItem();

        if (HotSauceApp.selectedSauce == null) {
            System.out.println("Error");
            return;
        }

        Stage stage = (Stage) errorText.getScene().getWindow();
        HotSauceUtilities.loadScene("modifySauceData.fxml", stage);
    }

    @FXML
    void addHotSauceButtonHandler(ActionEvent event) {
        /*
        1. create the hot sauce object
        2. add it to the array list
        3. reload the listview
        4. clear the text fields to get ready for the new sauce
         */

        try {
            String brand = brandInputTextField.getText();
            String name = nameInputTextField.getText();

            int calories = Integer.parseInt(caloriesInputTextField.getText());
            boolean lethal = lethalInputCheckBox.isSelected();

            HotSauce newHotSauce = new HotSauce(brand, name, calories, lethal);

            HotSauceApp.hotSauceInventory.add(newHotSauce);

            brandInputTextField.setText("");
            nameInputTextField.setText("");
            caloriesInputTextField.setText("");
            lethalInputCheckBox.setSelected(false);
            errorText.setText("");
        } catch (NumberFormatException e) {
            errorText.setText("You must enter a number for calories.");
        }

        loadSaucesToListView();
    }

    @FXML
    void test(ActionEvent event) {
        try {
            // open a new scene in a new stage
//            Stage stage = new Stage();
//            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("bonusFeatures.fxml"));
//            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//            stage.setTitle("Hello!");
//            stage.setScene(scene);
//            stage.show();

            // open a new scene in the same stage
            // the way to get a reference to THIS current stage
            Stage thisCurrentstage = (Stage)errorText.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HotSauceApp.class.getResource("bonusFeatures.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            thisCurrentstage.setTitle("Hello!");
            thisCurrentstage.setScene(scene);
            thisCurrentstage.show();
        } catch (IOException e) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    void lethalToggleHandler(ActionEvent event) {
        boolean lethalIsSelected = lethalToggle.isSelected();
        showBasedOnLethal(lethalIsSelected);

    }

    private void showBasedOnLethal(boolean toggleIsLethal) {
        hotSauceListView.getItems().clear();
        for (int i = 0; i<HotSauceApp.hotSauceInventory.size(); i++) {
            if (HotSauceApp.hotSauceInventory.get(i).isLethal() == toggleIsLethal) {
                hotSauceListView.getItems().add(HotSauceApp.hotSauceInventory.get(i));
            } else {
                // don't add to listview
            }
        }
    }

    public void initialize() {
//        HotSauce tabasco = new HotSauce("Tabasco", "Tabasco Original", 0, false);
//        HotSauce ghostPepperSauce = new HotSauce("ACME", "Don't drink this", 5, true);
//
//        hotSauceInventory.add(tabasco);
//        hotSauceInventory.add(ghostPepperSauce);

        loadSaucesToListView();

    }

    @FXML
    void showAllButtonHandler(ActionEvent event) {
        loadSaucesToListView();
    }

    @FXML
    void showLethalButtonHandler(ActionEvent event) {
        hotSauceListView.getItems().clear();
        showBasedOnLethal(true);
    }

    @FXML
    void lowCalButtonHandler(ActionEvent event) {
        hotSauceListView.getItems().clear();
        for (int i = 0; i<HotSauceApp.hotSauceInventory.size(); i++) {
            if (HotSauceApp.hotSauceInventory.get(i).getCalories() < 50) {
                hotSauceListView.getItems().add(HotSauceApp.hotSauceInventory.get(i));
            } else {
                // don't add to listview
            }
        }
    }

    @FXML
    void saveFileButtonHandler(ActionEvent event) {
        writeSaucesToFile();
    }

    private void writeSaucesToFile() {
        try {
            FileWriter output = new FileWriter("src/output.txt");

            for (int i = 0; i < HotSauceApp.hotSauceInventory.size(); i++) {
                output.write(HotSauceApp.hotSauceInventory.get(i).fileOutputData() + "\n");
            }


            // some code
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // clean up
            // runs no matter

        }

    }

    public void loadSaucesToListView() {
        hotSauceListView.getItems().clear();
        for (int i = 0; i<HotSauceApp.hotSauceInventory.size(); i++) {
            hotSauceListView.getItems().add(HotSauceApp.hotSauceInventory.get(i));
        }
    }

}

class HotSauce {
    private String brand;
    private String name;
    private int calories;
    private boolean lethal;

    public HotSauce(String brand, String name, int calories, boolean lethal) {
        this.brand = brand;
        this.name = name;
        this.calories = calories;
        this.lethal = lethal;
    }

    public String fileOutputData() {
        return brand + " " + name + " " + calories + " " + lethal;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isLethal() {
        return lethal;
    }

    @Override
    public String toString() {
        return "HotSauce{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", lethal=" + lethal +
                '}';
    }
}
