package be.vitali;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MainMenuController {
    @FXML private javafx.scene.control.Button closeButton;

    @FXML
    private void quit() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void initialize() { }
}