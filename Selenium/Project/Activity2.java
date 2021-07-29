package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
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
      //  WebElement element = driver.findElement(By.tagName("h1"));
    	WebElement element = driver.findElement(By.xpath("//*[@class='entry-title']"));
     
        String heading1 = element.getText();
       
        System.out.println("Heading: " + heading1);
        
        
     
        
        Assert.assertEquals(heading1, "Welcome to Alchemy Jobs");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        Reporter.log("Test Completed");
        driver.quit();
    }

}
