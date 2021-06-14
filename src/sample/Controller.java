package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private Button add;

    @FXML
    private Button mul;

    @FXML
    private Button sub;

    @FXML
    private Button div;

    @FXML
    private Button sin;

    @FXML
    private Button cos;

    @FXML
    private Button expo;

    @FXML
    private Button tan;

    @FXML
    private Label lb;

    @FXML
    private Button clear;

    @FXML
    void addbutton(ActionEvent event) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        try {
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            double c = 0;

            if (event.getSource() == add) {
                c = a + b;
            }
            String result = String.valueOf(c);
            lb.setText("The addition is : " + result);
        }
        catch(NumberFormatException exception){
            lb.setText("Invalid input. \nPlease enter a " +
                    "number");
        }
    }

    @FXML
    void divbutton(ActionEvent event) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        try {
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            double c = 0;

            if (event.getSource() == div) {
                c = a / b;
            }
            String result = String.valueOf(c);
            lb.setText("The division is : " + result);
        }
        catch(NumberFormatException exception){
            lb.setText("Invalid input. \nPlease enter a " +
                    "number");
        }
    }

    @FXML
    void multibutton(ActionEvent event) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        try {

            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);

            double c = 0;

            if (event.getSource() == mul) {

                c = a * b;

            }
            String result = String.valueOf(c);
            lb.setText("The multiplication is : " + result);
        }
        catch(NumberFormatException exception){
            lb.setText("Invalid input. \nPlease enter a " +
                    "number");
        }
    }

    @FXML
    void subbutton(ActionEvent event) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        try {

            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);

            double c = 0;

            if (event.getSource() == sub) {

                c = a - b;

            }
            String result = String.valueOf(c);
            lb.setText("The  subtraction is : " + result);
        }
        catch(NumberFormatException exception){
            lb.setText("Invalid input. \nPlease enter a " +
                    "number");
        }
    }

    @FXML
    void sinbutton(ActionEvent event) {
        String s = tf1.getText();
        try {

            double degree = Double.parseDouble(s);
            double rad = Math.toRadians(degree);
            double sinVal = Math.sin(rad);

            String result = String.valueOf(sinVal);
            lb.setText("The sin value is : " + result);
        }
        catch(NumberFormatException exception){
            lb.setText("Invalid input. \nPlease enter a " +
                    "number");
        }


    }

    @FXML
    void cosbutton(ActionEvent event) {
        String s = tf1.getText();
        try {
            double degree = Double.parseDouble(s);
            double rad = Math.toRadians(degree);
            double cosVal = Math.cos(rad);

            String result = String.valueOf(cosVal);
            lb.setText("The cos value is : " + result);
        }
        catch(NumberFormatException exception){
            lb.setText("Invalid input. \nPlease enter a " +
                    "number");
        }

    }


    @FXML
    void tanbutton(ActionEvent event) {
        String s = tf1.getText();
        try {

            double degrees = Double.parseDouble(s);
            double rad = Math.toRadians(degrees);
            double tanVal = Math.tan(rad);

            String result = String.valueOf(tanVal);
            lb.setText("The tan value is : " + result);
        }
        catch(NumberFormatException exception){
            lb.setText("Invalid input. \nPlease enter a " +
                    "number");
        }

    }

    @FXML
    void expobutton(ActionEvent event) {
        String s = tf1.getText();
        try {

            double power = Double.parseDouble(s);
            double expo = Math.exp(power);

            String result = String.valueOf(expo);
            lb.setText("The exponential value is : "+result);
        }
        catch(NumberFormatException exception){
            lb.setText("Invalid input. \nPlease enter a " +
                    "number");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
