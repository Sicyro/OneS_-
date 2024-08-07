module ru.sicuro.ones_launcher {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sicuro.ones_launcher to javafx.fxml;
    exports ru.sicuro.ones_launcher;
}