package selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class SeleniumProject {

    WebDriver driver;
    
    public void OpenSite(){
        
        driver = new FirefoxDriver();
        driver.get("http://phptravels.com/demo/");
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg btn-block' and 1]")).click();
        
    }
    
    public void testLogin(){
        
        driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/");
        
    }
    
    
    public static void main(String[] args) {
        
        
     System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");   
     SeleniumProject testOpen = new SeleniumProject();
     testOpen.testLogin();
        
        
        
        
    }
    
}
