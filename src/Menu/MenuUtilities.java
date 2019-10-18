package Menu;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import sample.MainWindowController;



public class MenuUtilities {


    public static MenuBar prepareMenu(){
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem fileClose = new MenuItem("Close program");
        MenuItem playerVsPlayer = new MenuItem("Player vs. Player");
        MenuItem playerVsComputer = new MenuItem("Player vs. Computer");

        fileClose.setGraphic(new ImageView("Images/logout.png"));
        fileClose.setOnAction(event -> MainWindowController.closeProgram());
        //playerVsPlayer.setOnAction( m.openPlayerVsPlayerWindow());
        fileMenu.getItems().add(playerVsPlayer);
        fileMenu.getItems().add(playerVsComputer);
        fileMenu.getItems().add(fileClose);
        menuBar.getMenus().add(fileMenu);
        return menuBar;
    }
}
