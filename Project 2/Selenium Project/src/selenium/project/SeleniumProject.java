package selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class SeleniumProject {

    WebDriver driver;
    
    public void InvokeBrowser(){
        
        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://phptravels.com/demo/");
        
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg btn-block' and 1]")).click();
        
    }
    
    
    public static void main(String[] args) {
        
     SeleniumProject testOpen = new SeleniumProject();
     testOpen.InvokeBrowser();
        
        
        
        
    }
    
}
