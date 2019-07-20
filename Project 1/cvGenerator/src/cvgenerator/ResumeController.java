/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvgenerator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

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
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SubmitResume(ActionEvent event) {
        
        //https://javarevisited.blogspot.com/2014/09/how-to-parse-html-file-in-java-jsoup-example.html
        try {
            Document doc = Jsoup.parse("<html></html>");
            doc.body().addClass("body-styles-cls");
            doc.body().appendElement("div");
            System.out.println(doc.toString());
        
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Resume2Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
