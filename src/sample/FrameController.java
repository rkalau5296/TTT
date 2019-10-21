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

    public javafx.scene.control.Label label;
    private String whoseTurn = "X";
    private String playerOne = "Player One";
    private String playerTwo = "Player Two";
    private int playerOneCounter = 0;
    private int playerTwoCounter = 0;

    @FXML
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;

    @Override
    public void initialize(URL location, ResourceBundle resource) {
        getNames();
    }

//    private void getNames(){
//        TextInputDialog dialog = new TextInputDialog("");
//        dialog.setTitle("Text Input Dialog");
//        dialog.setHeaderText("Look, a Text Input Dialog");
//        dialog.setContentText("Please enter your name:");
//    }

    private void setResult() {

        String whomTurn = "";
        if (whoseTurn.equals("X"))
        {
            whomTurn = playerOne;
        } else {
            whomTurn = playerTwo;
        }
        label.setText(playerOne + "'s Score is : " + playerOneCounter + "\t" + whomTurn + "'s move" +
                        "\t" + playerTwo + "'s Score is : " + playerTwoCounter);
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
        if(whoseTurn.equals("X")){
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
//    private void displayPlayerOneWinningMessage(){
//        JOptionPane.showMessageDialog(this,
//                playerOne + " is winner.",
//                "WINNER!",
//                JOptionPane.INFORMATION_MESSAGE
//                );
//        playerOneCounter++;
//        resetGame();
//
//    }
//    private void displayPlayerTwoWinningMessage(){
//        JOptionPane.showMessageDialog(this,
//                playerTwo + " is winner.",
//                "WINNER!",
//                JOptionPane.INFORMATION_MESSAGE
//        );
//        playerTwoCounter++;
//        resetGame();
//    }
    private void displayPlayerOneWinningMessage(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("WINNER!");
        alert.setContentText(playerOne + " is winner.");
        alert.setHeaderText("Congratulation!");
        alert.show();
        playerOneCounter++;
        resetGame();
    }
    private void displayPlayerTwoWinningMessage(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("WINNER!");
        alert.setContentText(playerTwo + " is winner.");
        alert.setHeaderText("Congratulation!");
        alert.show();
        playerTwoCounter++;
        resetGame();
    }
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
    private void determineWhoWon(){
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
        boolean isEmpty = button1.getText().isEmpty();
        if (!isEmpty){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setContentText("The field is clicked.");
            alert.setHeaderText("Choose another button");
            alert.show();
        }else {

            button1.setText(whoseTurn);
            setColourAndFont(button1);
            setResult();
            determineWhoseTurn();
            determineWhoWon();
            draw();
        }

    }
    public void button2ActionPerformed(){
        boolean isEmpty = button2.getText().isEmpty();
        if (!isEmpty){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setContentText("The field is clicked.");
            alert.setHeaderText("Choose another button");
            alert.show();
        }else {
            button2.setText(whoseTurn);
            setColourAndFont(button2);
            setResult();
            determineWhoseTurn();
            determineWhoWon();
            draw();
        }
    }
    public void button3ActionPerformed(){
        boolean isEmpty = button3.getText().isEmpty();
        if (!isEmpty){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setContentText("The field is clicked.");
            alert.setHeaderText("Choose another button");
            alert.show();
        }else {
            button3.setText(whoseTurn);
            setColourAndFont(button3);
            setResult();
            determineWhoseTurn();
            determineWhoWon();
            draw();
        }
    }
    public void button4ActionPerformed(){
        boolean isEmpty = button4.getText().isEmpty();
        if (!isEmpty){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setContentText("The field is clicked.");
            alert.setHeaderText("Choose another button");
            alert.show();
        }else {
            button4.setText(whoseTurn);
            setColourAndFont(button4);
            setResult();
            determineWhoseTurn();
            determineWhoWon();
            draw();
        }
    }
    public void button5ActionPerformed(){
        boolean isEmpty = button5.getText().isEmpty();
        if (!isEmpty){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setContentText("The field is clicked.");
            alert.setHeaderText("Choose another button");
            alert.show();
        }else {
            button5.setText(whoseTurn);
            setColourAndFont(button5);
            setResult();
            determineWhoseTurn();
            determineWhoWon();
            draw();
        }
    }
    public void button6ActionPerformed(){
        boolean isEmpty = button6.getText().isEmpty();
        if (!isEmpty){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setContentText("The field is clicked.");
            alert.setHeaderText("Choose another button");
            alert.show();
        }else {
            button6.setText(whoseTurn);
            setColourAndFont(button6);
            setResult();
            determineWhoseTurn();
            determineWhoWon();
            draw();
        }
    }
    public void button7ActionPerformed(){
        boolean isEmpty = button7.getText().isEmpty();
        if (!isEmpty){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setContentText("The field is clicked.");
            alert.setHeaderText("Choose another button");
            alert.show();
        }else {
            button7.setText(whoseTurn);
            setColourAndFont(button7);
            setResult();
            determineWhoseTurn();
            determineWhoWon();
            draw();
        }
    }
    public void button8ActionPerformed(){
        boolean isEmpty = button8.getText().isEmpty();
        if (!isEmpty){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setContentText("The field is clicked.");
            alert.setHeaderText("Choose another button");
            alert.show();
        }else {
            button8.setText(whoseTurn);
            setColourAndFont(button8);
            setResult();
            determineWhoseTurn();
            determineWhoWon();
            draw();
        }
    }
    public void button9ActionPerformed(){
        boolean isEmpty = button9.getText().isEmpty();
        if (!isEmpty){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setContentText("The field is clicked.");
            alert.setHeaderText("Choose another button");
            alert.show();
        }else {
            button9.setText(whoseTurn);
            setColourAndFont(button9);
            setResult();
            determineWhoseTurn();
            determineWhoWon();
            draw();
        }
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
//            JOptionPane.showMessageDialog(this,
//                    "Draw, tie",
//                    "Draw, tie game",
//                    JOptionPane.INFORMATION_MESSAGE
//            );
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Draw, tie");
            alert.setContentText("Draw, tie game");
            alert.setHeaderText("Draw, tie game");
            alert.show();
        }

    }

}
