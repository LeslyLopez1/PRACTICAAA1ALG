module com.example.demoxxx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoxxx to javafx.fxml;
    exports com.example.demoxxx;
}