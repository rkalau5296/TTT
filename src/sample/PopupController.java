package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PopupController implements Initializable {
    Stage popupStage;

    @FXML
    Button yesButton, noButton;


    @Override
    public void initialize(URL location, ResourceBundle resource) {

    }
    public void close(){
        popupStage = (Stage) noButton.getScene().getWindow();
        popupStage.close();
    }
    public void openPlayerVsPlayerWindowAgain(){
        MainWindowController mainWindowController = new MainWindowController();
        mainWindowController.openPlayerVsPlayerWindow();
    }
    public void openPopupWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("popupWindow.fxml"));
        popupStage = new Stage();
        popupStage.setTitle("YES/NO");
        popupStage.setResizable(false);
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.setScene(new Scene(loader.load()));
        popupStage.show();
    }
}
