package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    Stage stage;

    @FXML
    Button button1PP, button2PC;

    @Override
    public void initialize(URL location, ResourceBundle resource) {
        button1PP.setGraphic(new ImageView("Images/pvp.jpg"));
        button2PC.setGraphic(new ImageView("Images/pvc.jpg"));
    }

    public static void closeProgram() {
        Platform.exit();
        System.exit(0);
    }

    public void openPlayerVsPlayerWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("frame.fxml"));
        stage = new Stage();
        stage.setTitle("Tic Tac Toe Player vs Player");
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }

    public void openPlayerVsComputerWindow() throws IOException {
        stage = new Stage();
        //stage.setScene(new Scene(playerVsPlayer.createContent()));
        stage.setTitle("Player vs Player");
        stage.setOnCloseRequest(event->{MainWindowController.closeProgram();});
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }



}
