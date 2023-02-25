package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class TechStudiesController{
    @FXML
    void onTopic2ButtonClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/TechStudies/TechStudiesTopic2.fxml"));
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
}
