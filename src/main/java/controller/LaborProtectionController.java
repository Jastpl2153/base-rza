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

    public void topicBut2() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LaborProtection/OrganisArrangements.fxml"));
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }

    public void topicBut3() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LaborProtection/Attire.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void topicBut6() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LaborProtection/TechnicalMeasures.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}
