module com.example.sql_4400 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.sql_4400 to javafx.fxml;
    exports com.example.sql_4400;
}