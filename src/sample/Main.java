package sample;

import Menu.MenuUtilities;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("mainWindow.fxml"));

        StackPane stackPane = loader.load();
        stackPane.getChildren().add(MenuUtilities.prepareMenu());
        stackPane.setAlignment(Pos.TOP_LEFT);

        primaryStage.getIcons().add(new Image("Images/tic-tac-toe.png"));
        primaryStage.setOnCloseRequest(event->{MainWindowController.closeProgram();});
        primaryStage.setHeight(300.0);
        primaryStage.setWidth(600.0);
        primaryStage.setMinWidth(300.0);
        primaryStage.setMinHeight(300.0);
        primaryStage.setTitle("TTT");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(stackPane));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
