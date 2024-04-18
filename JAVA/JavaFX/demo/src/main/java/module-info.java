module adressapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens adressapp to javafx.fxml;
    exports adressapp;
}
