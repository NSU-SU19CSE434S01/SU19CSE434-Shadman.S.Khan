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
public class SignUpTest {
    
    public SignUpTest() {
    }
    WebDriver driver;
    
    @Test
    public void signUpTest(){
        
        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/register");
        driver.findElement(By.xpath("//div[3]/input[@class='form-control' and 1]")).sendKeys("Shadman");
        driver.findElement(By.xpath("//div[4]/input[@class='form-control' and 1]")).sendKeys("S. Khan");
        driver.findElement(By.xpath("//div[5]/input[@class='form-control' and 1]")).sendKeys("017000000");
        driver.findElement(By.xpath("//div[6]/input[@class='form-control' and 1]")).sendKeys("shadman@gmail.com");
        driver.findElement(By.xpath("//div[7]/input[@class='form-control' and 1]")).sendKeys("123456");
        driver.findElement(By.xpath("//div[8]/input[@class='form-control' and 1]")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")).click();
        
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
