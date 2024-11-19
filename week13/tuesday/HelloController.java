package com.example.week13;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloController {

    @FXML
    private Button addHotSauceButton;

    @FXML
    private TextField addHotSauceTextField;

    @FXML
    private ListView<HotSauce> hotSauceListView;

    @FXML
    private Button removeHotSauceButton;

    private ArrayList<HotSauce> db = new ArrayList<>();

    public void initialize() {
//        HotSauce s1= new HotSauce("Tabasco", 7.5f);
//        HotSauce s2 = new HotSauce("Ghost Pepper Sauce", 3.2f);
//        db.add(s1);
//        db.add(s2);
//        db.add(new HotSauce("Ronald McDonald Sauce", 3.5f));

        db = loadSaucesFromFile("saucelist.txt");
        loadSaucesIntoListView();
    }

    private ArrayList<HotSauce> loadSaucesFromFile(String filename) {
        ArrayList<HotSauce> loadedSauces = new ArrayList<>();
        // do some stuff
        // file input
        // use Scanner class
        // the argument we sent in
        // used to be System.in
        // std input stream --- > keyboard
        // now our input stream will be that file!
        File inputFile = new File(filename);
        Scanner input = null;
        try {
            input = new Scanner(inputFile);

            while(input.hasNext()) {
                // keep looping
                // as long as the input stream
                // has a string to give me
                String nextPieceOfInfo = input.next();
                // even if we have numerical data
                // it's "easier" to just deal with EVERYTHING
                // as a String
                String sauceName = nextPieceOfInfo;
                nextPieceOfInfo = input.next();
                float sauceSize = Float.parseFloat(nextPieceOfInfo);
                HotSauce sauce = new HotSauce(sauceName, sauceSize);
                loadedSauces.add(sauce);
            }
        } catch (FileNotFoundException e) {
            // a file not found exception has been thrown
            // what do we do about it???

            System.out.println("File was not found.");

            throw new RuntimeException(e);
        } catch (InputMismatchException e) {

        } catch (Exception e) {
            // similar to else clause
            // catches EVERY other type of Exception
            // because Exception is a super class
            // for ALL exceptions
            // a VERY general error
            // can't handle problems in a very specific way

            System.out.println("Error.  Contact support.");

        }
        // same as Scanner input = new Scanner(new File(filename));





        return loadedSauces;
    }

    private void loadSaucesIntoListView() {
        hotSauceListView.getItems().clear();
        for (int i =0; i < db.size(); i++) {
            hotSauceListView.getItems().add(db.get(i));
        }
    }

    @FXML
    void addHotSauceHandler(ActionEvent event) {
        HotSauce newSauce = new HotSauce(addHotSauceTextField.getText(), 7.99f);
        db.add(newSauce);

        loadSaucesIntoListView();
        addHotSauceTextField.setText("");
    }

    @FXML
    void removeHotSauceHandler(ActionEvent event) {
        HotSauce selectedSauce = hotSauceListView.getSelectionModel().getSelectedItem();
        db.remove(selectedSauce);
        // hotSauceListView.getItems().remove(selectedSauce);
        loadSaucesIntoListView();
    }

}

class HotSauce {
    private String name;
    private float size;

    public HotSauce(String name, float size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return name;
    }
}
