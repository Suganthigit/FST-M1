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

public class Activity7 {
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
    	 Reporter.log("Click the Post Job");
        WebElement element = driver.findElement(By.id("menu-item-26"));
        
      //Creating object of an Actions class
        Actions action = new Actions(driver);

        //Performing the mouse hover action on the target element.
        action.moveToElement(element).click().build().perform();
        
        Thread.sleep(5000);
        //Fill in necessary details:
        driver.findElement(By.id("create_account_email")).sendKeys("sugn@domain.com");
        driver.findElement(By.id("job_title")).sendKeys("Banking");
        driver.findElement(By.id("job_description")).sendKeys("Tester");
        driver.findElement(By.id("application")).sendKeys("sugn@domain.com");
        driver.findElement(By.id("company_name")).sendKeys("sugn@domain.com");
        
        //click preview button
        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);
        //clcik submit listing
        driver.findElement(By.id("job_preview_submit_button")).click();
        
        //
        driver.findElement(By.linkText("Jobs")).click();
        driver.findElement(By.id("search_keywords")).sendKeys("Banking");
      
       driver.findElement(By.className("search_submit")).click();
        
       
//        String expected = "Jobs – Alchemy Jobs";
//        String actual = driver.getTitle();
//        if(expected.equals(actual)) 
//        	System.out.println("The title is correct");
//        else
//        	System.out.println("The title is incorrect");
//       // Reporter.log("the tile of job is " + driver.getTitle());
//        
//       // System.out.println("Title after clicking jobs is "+ driver.getTitle());
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        Reporter.log("Test Completed");
        driver.quit();
    }

}
