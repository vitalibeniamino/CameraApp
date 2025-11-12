package be.vitali;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainMenuController {
    //@FXML private javafx.scene.control.Button closeButton;
    BorderPane borderPane;
    HBox footer;
    VBox menu;
    Button recordButton;
    Button settingsButton;
    Button closeButton;
    Button switchCamera;

    /*@FXML
    private void quit() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }*/

    @FXML
    public void initialize() {
        borderPane = new BorderPane();
        footer = new HBox();
        menu = new VBox();
        recordButton = new Button();
        settingsButton = new Button();
        closeButton = new Button();
        switchCamera = new Button();
        footer.setStyle("-fx-background-color: #ff0000");
        menu.setStyle("-fx-background-color: #00ff00");
        footer.getChildren().addAll(closeButton, switchCamera);
        menu.getChildren().addAll(recordButton, settingsButton);
        borderPane.setCenter(menu);
        borderPane.setBottom(footer);
    }
}