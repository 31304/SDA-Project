package com.example.cafeconnect;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController  {

    @FXML
    private Label welcomeText;

    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }

}