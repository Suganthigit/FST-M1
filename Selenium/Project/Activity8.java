package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin/");
        Reporter.log("Test Started");
    }

    @Test
    public void loginTest() throws InterruptedException {
        // Check the title of the page
    	Reporter.log("User tries to login");
    	
        driver.findElement(By.id("user_login")).sendKeys("sugn");
        driver.findElement(By.id("user_pass")).sendKeys("qwert123456");
        driver.findElement(By.id("wp-submit")).click();
        
        Assert.assertEquals("Profile ‹ Alchemy Jobs — WordPress",driver.getTitle());
  
  
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        Reporter.log("Test Completed");
        driver.quit();
    }

}
