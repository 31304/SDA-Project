package com.example.cafeconnect;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println(event);

           try {
               FXMLLoader loader = new FXMLLoader(getClass().getResource("Addsale.fxml"));
               Stage stage = new Stage();
               Scene scene = new Scene(loader.load());
               stage.setScene(scene);
           }catch (IOException io){
               io.printStackTrace();
           }

    }
    @FXML

    public static void main(String[] args) {
        launch();
    }
}