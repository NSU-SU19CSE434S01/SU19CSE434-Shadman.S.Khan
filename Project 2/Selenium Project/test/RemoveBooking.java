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
public class RemoveBooking {
    
    public RemoveBooking() {
    }

    WebDriver driver;
    @Test
    public void removeCustomer(){
        
        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/admin");
        driver.findElement(By.xpath("//input[@class='form-control' and @type='text']")).sendKeys("admin@phptravels.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("demoadmin");
        driver.findElement(By.xpath("//*[@class='btn btn-primary btn-block ladda-button fadeIn animated']")).click();
        driver.get("https://www.phptravels.net/admin/bookings/");
        driver.findElement(By.xpath("//a[@id='7']")).click();
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
