module com.mycompany.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.scenebuilder to javafx.fxml;
    exports com.mycompany.scenebuilder;
}
