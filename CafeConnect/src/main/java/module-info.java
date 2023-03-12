module com.example.cafeconnect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cafeconnect to javafx.fxml;
    exports com.example.cafeconnect;
}