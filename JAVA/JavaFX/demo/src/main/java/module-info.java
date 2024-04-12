module adressapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens adressapp to javafx.fxml;
    exports adressapp;
}
