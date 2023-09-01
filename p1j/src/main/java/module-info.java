module com.example.p1j {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.p1j to javafx.fxml;
    exports com.example.p1j;
}