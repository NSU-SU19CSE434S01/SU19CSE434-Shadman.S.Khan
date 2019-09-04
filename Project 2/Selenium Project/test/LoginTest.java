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
public class LoginTest {
    
    
    public LoginTest() {
    }
        WebDriver driver;
        
        @Test
        public void testLogin(){
            
        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/");
        driver.findElement(By.xpath("//ul/ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu' and 1]/li[@id='li_myaccount' and 1]")).click();
        driver.findElement(By.xpath("//li[@class='open']/ul[@class='dropdown-menu' and 1]/li[1]/a[@class='go-text-right' and 1]")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("user@phptravels.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demouser");
        driver.findElement(By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']")).click();
    
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
