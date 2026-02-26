module com.example.solitariooo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solitariooo to javafx.fxml;
    exports com.example.solitariooo;
}