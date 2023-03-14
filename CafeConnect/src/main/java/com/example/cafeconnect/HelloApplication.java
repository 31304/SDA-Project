package com.example.cafeconnect;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main Administrator"+".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
//    @FXML
    void Display(ActionEvent event,String name,String Title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(name+".fxml"));
        Scene scene = new Scene(root, 600, 400);
        Stage Window =(Stage) ((Node)event.getSource()).getScene().getWindow();
        Window.setTitle(Title);
        Window.setScene(scene);
        Window.show();
    }
    private String getId(ActionEvent event)
    {

        String [] id= (event.getSource().toString()).split("=");
        id=id[1].split(",");
        return id[0];
    }
    public void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println(event.getSource());
        String Name="hello-view";
        String Title="";

        if(getId(event).equals("AddItem"))
        {
            Name= "Addsale";
            Title= "Sale Process";
        }
        else if(getId(event).equals("ReturnItem"))
        {
            Name= "Return";
            Title= "Return";
        }
        else if(getId(event).equals("Update"))
        {
            Name= "Update";
            Title= "Update";
        }
        else if(getId(event).equals("AddCashier"))
        {
            Name= "Manage Manager";
            Title= "Manage Cashier";
        }
        else if(getId(event).equals("BackCashier"))
        {
            Name= "hello-view";
            Title= "Cashier";
        }
        else if(getId(event).equals("BackMainAdministrator"))
        {
            Name= "Main Administrator";
            Title= "Administrator";
        }
        else if(getId(event).equals("BackManageManager"))
        {
            Name= "Manage Manager";
            Title= "Cashier";
        }
        Display(event,Name,Title);
    }
    public static void main(String[] args) {
        launch();
    }
}