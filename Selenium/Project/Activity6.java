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

public class Activity6 {
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
    public void jobTitle() {
        // Check the title of the page
        WebElement element = driver.findElement(By.linkText("Jobs"));
        element.click();
        Reporter.log("the tile of job is " + driver.getTitle());
        String expected = "Jobs – Alchemy Jobs";
        String actual = driver.getTitle();
        if(expected.equals(actual)) 
        	System.out.println("The title is correct");
        else
        	System.out.println("The title is incorrect");
       // Reporter.log("the tile of job is " + driver.getTitle());
        
       // System.out.println("Title after clicking jobs is "+ driver.getTitle());
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        Reporter.log("Test Completed");
        driver.quit();
    }

}
