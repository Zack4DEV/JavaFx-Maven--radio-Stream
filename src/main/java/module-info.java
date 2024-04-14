module stream.radio {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    
    opens stream.radio to javafx.fxml;
    exports stream.radio;
}
