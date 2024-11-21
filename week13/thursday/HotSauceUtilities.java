package com.example.hotsauceapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HotSauceUtilities {
    public static void loadScene(String fxmlFile, Stage stage) {
        try {

            // open a new scene in the same stage
            // the way to get a reference to THIS current stage
            FXMLLoader fxmlLoader = new FXMLLoader(HotSauceApp.class.getResource(fxmlFile));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
