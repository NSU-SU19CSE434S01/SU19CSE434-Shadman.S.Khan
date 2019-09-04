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
        
        
        
    }
    
    
    public static void main(String[] args) {
        
        
     System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");   
     SeleniumProject testOpen = new SeleniumProject();
     testOpen.signUpTest();
        
        
        
        
    }
    
}
