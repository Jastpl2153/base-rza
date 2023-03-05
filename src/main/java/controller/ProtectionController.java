package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ProtectionController {
    @FXML
    public void gasProtection() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Protection/GasProtection.fxml"));
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
}
