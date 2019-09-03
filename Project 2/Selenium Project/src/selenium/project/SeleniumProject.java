package selenium.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class SeleniumProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        
    }
    
}
