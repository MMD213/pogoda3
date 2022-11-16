module com.example.pog {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;


    opens com.example.pog to javafx.fxml;
    exports com.example.pog;
    exports form;
    opens form to javafx.fxml;
}