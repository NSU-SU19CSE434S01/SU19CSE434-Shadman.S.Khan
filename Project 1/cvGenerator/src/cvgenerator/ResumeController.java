/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvgenerator;

import java.io.File;
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
import org.apache.commons.io.FileUtils;
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
    private TextField SexInput;
    @FXML
    private TextField MaritalStatusInput;
    @FXML
    private TextField DobInput;
    @FXML
    private TextField PobInput;
    @FXML
    private Button SubmitButton;
    @FXML
    private TextField ImageInput;
    @FXML
    private Button ImageUpload;
 
    
    
    
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
        
            File htmlTemplateFile = new File("SampleCV/CV.html");
            System.out.println(htmlTemplateFile.exists());
            String htmlString = FileUtils.readFileToString(htmlTemplateFile);
            htmlString = htmlString.replace("$name", NameInput.getText());
            htmlString = htmlString.replace("$address", AddressInput.getText());
            htmlString = htmlString.replace("$telephone", TelephoneInput.getText());
            htmlString = htmlString.replace("$email", EmailInput.getText());
            htmlString = htmlString.replace("$nationality", NationalityInput.getText());
            htmlString = htmlString.replace("$sex", SexInput.getText());
            htmlString = htmlString.replace("$maritalStatus", MaritalStatusInput.getText());
            htmlString = htmlString.replace("$dob", DobInput.getText());
            htmlString = htmlString.replace("$pob", PobInput.getText());
            
            File newHtmlFile = new File("CvCollection/"+NameInput.getText()+"CV.html");
            FileUtils.writeStringToFile(newHtmlFile, htmlString);
            
            
        } catch (IOException ex) {
            Logger.getLogger(ResumeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
