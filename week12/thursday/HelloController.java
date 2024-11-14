package com.example.hotsauceapp;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private ListView<HotSauce> hotSauceListView;

    private ArrayList<HotSauce> hotSauceInventory = new ArrayList<>();

    @FXML
    private TextField brandInputTextField;

    @FXML
    private TextField caloriesInputTextField;

    @FXML
    private CheckBox lethalInputCheckBox;

    @FXML
    private TextField nameInputTextField;

    @FXML
    void addHotSauceButtonHandler(ActionEvent event) {
        /*
        1. create the hot sauce object
        2. add it to the array list
        3. reload the listview
        4. clear the text fields to get ready for the new sauce
         */

        String brand = brandInputTextField.getText();
        String name = nameInputTextField.getText();
        int calories = Integer.parseInt(caloriesInputTextField.getText());
        boolean lethal = lethalInputCheckBox.isSelected();

        HotSauce newHotSauce = new HotSauce(brand, name, calories, lethal);

        hotSauceInventory.add(newHotSauce);

        brandInputTextField.setText("");
        nameInputTextField.setText("");
        caloriesInputTextField.setText("");
        lethalInputCheckBox.setSelected(false);

        loadSaucesToListView();
    }

    public void initialize() {
        HotSauce tabasco = new HotSauce("Tabasco", "Tabasco Original", 0, false);
        HotSauce ghostPepperSauce = new HotSauce("ACME", "Don't drink this", 5, true);

        hotSauceInventory.add(tabasco);
        hotSauceInventory.add(ghostPepperSauce);

        loadSaucesToListView();
    }

    public void loadSaucesToListView() {
        hotSauceListView.getItems().clear();
        for (int i = 0; i<hotSauceInventory.size(); i++) {
            hotSauceListView.getItems().add(hotSauceInventory.get(i));
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
