package ru.davydov.davydov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VicController {

    @FXML
    private Button Btn;

    @FXML
    private TextField chisTextField;

    @FXML
    private Label des;

    @FXML
    private Label edin;

    @FXML
    void BtnOnAction(ActionEvent event) {
int a=Integer.parseInt(chisTextField.getText().toString());
double b= a/10;
double с= a%10;
des.setText("левая цифра: "+b);
edin.setText("правая цифра: "+с);
    }

}
