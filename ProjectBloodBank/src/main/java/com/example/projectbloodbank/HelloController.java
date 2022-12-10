
package com.example.projectbloodbank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {


    @FXML
    private SplitMenuButton dvsn;

    @FXML
    private SplitMenuButton bloodgroup;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton female;

    @FXML
    private RadioButton third;

    @FXML
    private PasswordField pass;

    @FXML
    private TextField phone;

    @FXML
    private TextField mail;

    @FXML
    private TextField name;

    @FXML
    private TextField age;

    @FXML
    private TextArea address;

    @FXML
    private Button submitBtn;

    @FXML
    void submitbutton(ActionEvent event) {
        String Name=name.getText();
        String Phone=phone.getText();
        String Mail=mail.getText();
        String Pass=pass.getText();
        String Age=age.getText();
        String Address=address.getText();
        String Gender;
        if (male.isSelected()){
            Gender="male";

        }
        else if(female.isSelected()){
            Gender="female";
        }
        else {
            Gender="third";
        }


        System.out.println(Gender);
    }

    @FXML
    void inputMail(ActionEvent event) {

    }

    @FXML
    void inputText(ActionEvent event) {

    }

}
