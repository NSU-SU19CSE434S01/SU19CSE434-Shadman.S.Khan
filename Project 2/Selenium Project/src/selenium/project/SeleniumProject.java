package selenium.project;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




@Test
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
        driver.findElement(By.xpath("//ul/ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu' and 1]/li[@id='li_myaccount' and 1]")).click();
        driver.findElement(By.xpath("//li[@class='open']/ul[@class='dropdown-menu' and 1]/li[1]/a[@class='go-text-right' and 1]")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("user@phptravels.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demouser");
        driver.findElement(By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']")).click();
        if("https://www.phptravels.net/account/".equals(driver.getCurrentUrl()))
        {
            System.out.println("login Successful");
        }
        else
            System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
    }
    
    public void signUpTest(){
        
        driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/register");
        driver.findElement(By.xpath("//div[3]/input[@class='form-control' and 1]")).sendKeys("Shadman");
        driver.findElement(By.xpath("//div[4]/input[@class='form-control' and 1]")).sendKeys("S. Khan");
        driver.findElement(By.xpath("//div[5]/input[@class='form-control' and 1]")).sendKeys("017000000");
        driver.findElement(By.xpath("//div[6]/input[@class='form-control' and 1]")).sendKeys("shadman@gmail.com");
        driver.findElement(By.xpath("//div[7]/input[@class='form-control' and 1]")).sendKeys("123456");
        driver.findElement(By.xpath("//div[8]/input[@class='form-control' and 1]")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")).click();
        
        if("https://www.phptravels.net/account/".equals(driver.getCurrentUrl()))
            System.out.println("SignUp Successful");
        else
        {
            System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
        }
    }
    
    public void bookingTest(){
        
        driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/");
        System.out.println(driver.findElement(By.xpath("//div[1]/article[@id='tour-36' and @class='box' and 1]/div[@class='details' and 1]/h4[@class='box-title go-text-right' and 1]/span[1]")).getText());
        driver.findElement(By.xpath("//div[2]/article[@id='tour-36' and @class='box' and 1]/figure[1]/a[@class='hover-effect popup-gallery' and 1]/img[1]")).click();
        driver.get("https://www.phptravels.net/tours/book/6-Days-Around-Thailand?date=04%2F09%2F2019&adults=1&child=0&infant=0");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Shawon");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Arefin");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Shawonarefin@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("Shawonarefin@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("01705631101");
        driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("31, cranberry Road");        
        driver.findElement(By.xpath("//button[@class='btn btn-success btn-lg btn-block completebook']")).click();
        
    
    
    }
    
    
    
    
    public static void main(String[] args) {
        
        
     System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");   
     SeleniumProject testOpen = new SeleniumProject();
     testOpen.bookingTest();
     
        
        
        
    }
    
}
