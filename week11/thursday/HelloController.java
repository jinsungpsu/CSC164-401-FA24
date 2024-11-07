package com.example.javafx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class HelloController {

    private Drink[] menu = new Drink[3];

    private int cookieClickedCounter = 0;
    @FXML
    private Button clearButton;

    @FXML
    private Button cookieClickerButton;

    @FXML
    private Text cookieCounterText;

    public void initialize() {
        System.out.println("Hello from the initialize method!");
        cookieCounterText.setText("Starting this addictive game...");
        Drink frapuccino = new Drink("Frap", 800);
        menu[0] = frapuccino;

        Drink coffee = new Drink("Black Coffee" , 0);
        menu[1] = coffee;

        Drink tea = new Drink("Tea", 0);
        menu[2] = tea;

        cookieCounterText.setText("Menu for Moonbucks is: " + menu[0] + "\n" + menu[1] + "\n" + menu[2]);
    }

    public HelloController() {
        System.out.println("Hello from Controller class constructor");
        // can't do this here, because FXML objects aren't loaded during the constructor
        // cookieCounterText.setText("Welcome to the application!");
    }

    @FXML
    void clearButtonActionHandler(ActionEvent event) {
        cookieClickedCounter=0;
        cookieCounterText.setText("Cookies spawned: " + cookieClickedCounter);
    }

    @FXML
    void cookieClickerButtonActionHandler(ActionEvent event) {
        cookieClickedCounter++;
        cookieCounterText.setText("Cookies spawned: " + cookieClickedCounter);
    }

}

class Drink {
    private String name;
    private int calories;

    public Drink(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
