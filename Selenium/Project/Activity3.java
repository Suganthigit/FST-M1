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

public class Activity3 {
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
    public void getImgUrlTest() {
        // Check the title of the page
      //  WebElement element = driver.findElement(By.tagName("h1"));
    	WebElement element = driver.findElement(By.xpath("//*[contains(@class,'attachment')]"));
        String heading1 = element.getText();
        Reporter.log("URL is " + element.getAttribute("src") );
        System.out.println("Url of the image is  " + element.getAttribute("src"));
        
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        Reporter.log("Test Completed");
        driver.quit();
    }

}
