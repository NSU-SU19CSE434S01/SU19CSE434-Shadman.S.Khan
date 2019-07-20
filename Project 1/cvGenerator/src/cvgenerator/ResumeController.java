/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvgenerator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author shadm
 */
public class ResumeController implements Initializable {
    
    private Label label;
    @FXML
    private TextField NameInput;
    @FXML
    private TextField AddressInput;
    @FXML
    private TextField TelephoneInput;
    @FXML
    private TextField EmailInput;
    @FXML
    private TextField NationalityInput;
    @FXML
    private TextField GenderInput;
    @FXML
    private TextField MaritalStatusInput;
    @FXML
    private TextField DobInput;
    @FXML
    private TextField PobInput;
    @FXML
    private Button SubmitButton;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SubmitResume(ActionEvent event) {
    }
    
}
