package de.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Text");
    }
}
