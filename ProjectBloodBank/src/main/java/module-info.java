module com.example.projectbloodbank {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.projectbloodbank to javafx.fxml;
    exports com.example.projectbloodbank;
}