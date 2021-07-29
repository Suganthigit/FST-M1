package seleniumproject;

import java.util.concurrent.TimeUnit;

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

public class Activity9 {
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
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Check the title of the page
    	Reporter.log("User tries to login");
    	
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        Reporter.log("User publishing post");
      driver.findElement(By.linkText("Job Listings")).click();
      driver.findElement(By.partialLinkText("Add")).click();
       driver.findElement(By.xpath("//*[contains(@class,'modal__header')]/button")).click();

        
        driver.findElement(By.id("post-title-0")).sendKeys("TEster");
        driver.findElement(By.id("_application")).sendKeys("sug@domain.com");
        driver.findElement(By.xpath("//*[contains(@class,'header__settings')]/button[2]")).click();
        Reporter.log("User published successfully");
        driver.findElement(By.xpath("//*[contains(@class,'publish-panel')]/button[1]")).click();
        driver.findElement(By.xpath("//*[contains(@class,'publish-panel')]/div/div")).isDisplayed();

  
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        Reporter.log("Test Completed");
        driver.quit();
    }

}
