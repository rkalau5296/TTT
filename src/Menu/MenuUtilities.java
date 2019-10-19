package Menu;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import sample.MainWindowController;

import java.io.IOException;

public class MenuUtilities {

    public static MenuBar prepareMenu(){
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem fileClose = new MenuItem("Close program");
        MenuItem playerVsPlayer = new MenuItem("Player vs. Player");
        MenuItem playerVsComputer = new MenuItem("Player vs. Computer");

        fileClose.setGraphic(new ImageView("Images/logout.png"));
        fileClose.setOnAction(event -> MainWindowController.closeProgram());
        playerVsPlayer.setGraphic(new ImageView("Images/pvp.jpg"));
        playerVsComputer.setGraphic(new ImageView("Images/pvc.jpg"));

        playerVsPlayer.setOnAction( event -> new MainWindowController().openPlayerVsPlayerWindow());
        playerVsComputer.setOnAction( event -> {
            try {
                new MainWindowController().openPlayerVsComputerWindow();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        fileMenu.getItems().add(playerVsPlayer);
        fileMenu.getItems().add(playerVsComputer);
        fileMenu.getItems().add(fileClose);
        menuBar.getMenus().add(fileMenu);
        return menuBar;
    }
}
