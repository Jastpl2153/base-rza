package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LaborProtectionController{
    @FXML
    public void topicBut1() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LaborProtection/ElectricalSaferyGroups.fxml"));
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
}
