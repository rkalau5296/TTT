package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class FrameController extends Component implements Initializable {

    Stage stage;
    private String whoseTurn = "X";
    private String playerOne = "Player One";
    private String playerTwo = "Player Two";
    int playerOneCounter = 0;
    int playerTwoCounter = 0;
    String whomTurn="";

    @FXML
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;

    public Label label1;

    @Override
    public void initialize(URL location, ResourceBundle resource) {
       //setResult();
        getNames();
    }

//    private void getNames(){
//        TextInputDialog dialog = new TextInputDialog("");
//        dialog.setTitle("Text Input Dialog");
//        dialog.setHeaderText("Look, a Text Input Dialog");
//        dialog.setContentText("Please enter your name:");
//    }

    public void setResult() {

        if (whoseTurn.equals("X"))
        {
            whomTurn = playerOne;
        } else {
            whomTurn = playerTwo;
        }
        label1.setText(playerOne + "'s Score is : " + playerOneCounter + "\t    " + whomTurn + "'s move" + playerTwo + "'s Score is : " + playerTwoCounter);
    }
    private void getNames(){
        playerOne = JOptionPane.showInputDialog(this,
                "Player one name:",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        playerTwo = JOptionPane.showInputDialog(this,
                "Player one name:",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        if(playerOne.equals("")){
            playerOne = "Player one";
        }
        if(playerTwo.equals("")){
            playerTwo = "Player two";
        }
    }
    private void determineWhoseTurn(){
        if( whoseTurn == "X"){
            whoseTurn = "O";
        } else whoseTurn = "X";
    }
    private void setColourAndFont(Button button){
        if( whoseTurn == "X"){
            button.setTextFill(Color.RED);
        } else {
            button.setTextFill(Color.BLUE);
        }
        button.setFont(Font.font ("Verdana bold", 80));

    }

    private void displayPlayerOneWinningMessage(){
        JOptionPane.showMessageDialog(this,
                playerOne + "Player one won",
                "WINNER!",
                JOptionPane.INFORMATION_MESSAGE
                );
        playerOneCounter++;
        resetGame();

    }
    private void displayPlayerTwoWinningMessage(){
        JOptionPane.showMessageDialog(this,
                playerTwo + "Player two won",
                "WINNER!",
                JOptionPane.INFORMATION_MESSAGE
        );
        playerTwoCounter++;
        resetGame();
    }
//    private void displayPlayerOneWinningMessage(){
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle("WINNER!");
//        alert.setContentText("Player one won");
//        alert.setHeaderText("Hurra!");
//        alert.show();
//        resetGame();
//    }
//    private void displayPlayerTwoWinningMessage(){
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle("WINNER!");
//        alert.setContentText("Player two won");
//        alert.setHeaderText("Hurra!");
//        alert.show();
//        resetGame();
//    }
    private void resetGame(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }
    public void determineWhoWon(){
        String one = button1.getText();
        String two = button2.getText();
        String three = button3.getText();
        String four = button4.getText();
        String five = button5.getText();
        String six = button6.getText();
        String seven = button7.getText();
        String eight = button8.getText();
        String nine = button9.getText();
        if(one.equals("X") && two.equals("X") && three.equals("X")){
            displayPlayerOneWinningMessage();
        }
        if(four.equals("X") && five.equals("X") && six.equals("X")){
            displayPlayerOneWinningMessage();
        }
        if(seven.equals("X") && eight.equals("X") && nine.equals("X")){
            displayPlayerOneWinningMessage();
        }
        if(one.equals("X") && four.equals("X") && seven.equals("X")){
            displayPlayerOneWinningMessage();
        }
        if(two.equals("X") && five.equals("X") && eight.equals("X")){
            displayPlayerOneWinningMessage();
        }
        if(three.equals("X") && six.equals("X") && nine.equals("X")){
            displayPlayerOneWinningMessage();
        }
        if(one.equals("X") && five.equals("X") && nine.equals("X")){
            displayPlayerOneWinningMessage();
        }
        if(three.equals("X") && five.equals("X") && seven.equals("X")){
            displayPlayerOneWinningMessage();
        }
        if(one.equals("O") && two.equals("O") && three.equals("O")){
            displayPlayerTwoWinningMessage();
        }
        if(four.equals("O") && five.equals("O") && six.equals("O")){
            displayPlayerTwoWinningMessage();
        }
        if(seven.equals("O") && eight.equals("O") && nine.equals("O")){
            displayPlayerTwoWinningMessage();
        }
        if(one.equals("O") && four.equals("O") && seven.equals("O")){
            displayPlayerTwoWinningMessage();
        }
        if(two.equals("O") && five.equals("O") && eight.equals("O")){
            displayPlayerTwoWinningMessage();
        }
        if(three.equals("O") && six.equals("O") && nine.equals("O")){
            displayPlayerTwoWinningMessage();
        }
        if(one.equals("O") && five.equals("O") && nine.equals("O")){
            displayPlayerTwoWinningMessage();
        }
        if(three.equals("O") && five.equals("O") && seven.equals("O")){
            displayPlayerTwoWinningMessage();
        }

    }
    public void button1ActionPerformed(){
        button1.setText(whoseTurn);
        setColourAndFont(button1);
        determineWhoseTurn();
        determineWhoWon();
        draw();
        //setResult();
    }
    public void button2ActionPerformed(){
        button2.setText(whoseTurn);
        setColourAndFont(button2);
        determineWhoseTurn();
        determineWhoWon();
        draw();
    }
    public void button3ActionPerformed(){
        button3.setText(whoseTurn);
        setColourAndFont(button3);
        determineWhoseTurn();
        determineWhoWon();
        draw();
    }
    public void button4ActionPerformed(){
        button4.setText(whoseTurn);
        setColourAndFont(button4);
        determineWhoseTurn();
        determineWhoWon();
        draw();
    }
    public void button5ActionPerformed(){
        button5.setText(whoseTurn);
        setColourAndFont(button5);
        determineWhoseTurn();
        determineWhoWon();
        draw();
    }
    public void button6ActionPerformed(){
        button6.setText(whoseTurn);
        setColourAndFont(button6);
        determineWhoseTurn();
        determineWhoWon();
        draw();
    }
    public void button7ActionPerformed(){
        button7.setText(whoseTurn);
        setColourAndFont(button7);
        determineWhoseTurn();
        determineWhoWon();
        draw();
    }
    public void button8ActionPerformed(){
        button8.setText(whoseTurn);
        setColourAndFont(button8);
        determineWhoseTurn();
        determineWhoWon();
        draw();
    }
    public void button9ActionPerformed(){
        button9.setText(whoseTurn);
        setColourAndFont(button9);
        determineWhoseTurn();
        determineWhoWon();
        draw();
    }

    private void draw(){
        String one = button1.getText();
        String two = button2.getText();
        String three = button3.getText();
        String four = button4.getText();
        String five = button5.getText();
        String six = button6.getText();
        String seven = button7.getText();
        String eight = button8.getText();
        String nine = button9.getText();
        if (!one.equals("") && !two.equals("")&& !three.equals("")
                &&!four.equals("")&&!five.equals("")&&!six.equals("")
                &&!seven.equals("")&&!eight.equals("")&&!nine.equals(""))
        {
            JOptionPane.showMessageDialog(this,
                    "Draw, tie",
                    "Draw, tie game",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

    }
}
