/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Shadman
 */
public class bookingTest {
    
    public bookingTest() {
    }

    WebDriver driver;
    @Test
    public void bookingTest(){
        
        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
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

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
