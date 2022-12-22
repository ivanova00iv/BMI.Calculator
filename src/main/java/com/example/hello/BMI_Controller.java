package com.example.hello;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BMI_Controller {
    @FXML
    private TextField weightTextField;

    @FXML
    private TextField  heightTextField;

    @FXML
    private TextField BMITextField;

    @FXML
    private Button calculateButton;

    @FXML
    private Button cancelButton;


    @FXML
    protected void calculateButtonOnAction(ActionEvent event) {

        BMITextField.setText(String.valueOf(calculate()));
    }

    public void cancelButtonOnAction(ActionEvent e)
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public double calculate() {
        double weight = Double.parseDouble(weightTextField.getText());
        double height = Double.parseDouble(heightTextField.getText());

        double bmi = weight / (height * height);

        return bmi;
    }
}