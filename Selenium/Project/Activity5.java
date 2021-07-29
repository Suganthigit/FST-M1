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

public class Activity5 {
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
    public void jobTitle() throws InterruptedException {
        // Check the title of the page
        WebElement element = driver.findElement(By.linkText("Jobs"));
        element.click();
        
        WebElement inputText = driver.findElement(By.id("search_keywords"));
        inputText.sendKeys("Automation");
        WebElement searchBtn = driver.findElement(By.className("search_submit"));
        searchBtn.click();
        Thread.sleep(5000);
        WebElement clickJob = driver.findElement(By.partialLinkText("IBM"));
        clickJob.click();
       // Thread.sleep(5000);
        WebElement clickJobApp = driver.findElement(By.xpath("//*[contains(@class,'application_button')]"));
        clickJobApp.click();
        //Thread.sleep(5000);
        WebElement emailJobApp = driver.findElement(By.xpath("//*[contains(@class,'job_application_email')]"));
        System.out.println(" Email id is " + emailJobApp.getText());
        Reporter.log(" Email id is " + emailJobApp.getText());
        
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        Reporter.log("Test Completed");
        driver.quit();
    }

}
