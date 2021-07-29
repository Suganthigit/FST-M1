package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
        Reporter.log("Test Started");
    }

    @Test
    public void titleTest() {
        // Check the title of the page
        String title = driver.getTitle();
            
        //Print the title of the page
        System.out.println("Page title is: " + title);
        Reporter.log("title is" + title);
        
        Assert.assertEquals(driver.getTitle(), "Alchemy Jobs – Job Board Application");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        Reporter.log("Test Completed");
        driver.quit();
    }

}
