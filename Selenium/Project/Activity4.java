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

public class Activity4 {
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
        WebElement element = driver.findElement(By.tagName("h2"));
    //	WebElement element = driver.findElement(By.xpath("//*[@class='entry-title']"));
     
        String heading2 = element.getText();
        Reporter.log("Heading: " + heading2);
        System.out.println("Heading: " + heading2);
        Assert.assertEquals(heading2, "Quia quis non");
        
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        Reporter.log("Test Completed");
        driver.quit();
    }

}
