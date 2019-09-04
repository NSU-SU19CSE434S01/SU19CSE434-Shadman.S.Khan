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
public class OpenWebSiteTest {
    
    public OpenWebSiteTest() {
    }

    WebDriver driver;
    
    @Test
    public void OpenSite(){
        
        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://phptravels.com/demo/");
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg btn-block' and 1]")).click();
        
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
