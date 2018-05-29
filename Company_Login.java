package company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Company_Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
			
		
		driver.get("https://www.talentbeehive.com/company-login.php");
		
		
		//Login
		driver.findElement(By.id("email")).sendKeys("techbuzz1990@gmail.com");
        driver.findElement(By.id("key")).sendKeys("ABHI@jeet1990");
        driver.findElement(By.xpath(".//*[@id='login-form']/button")).click();
        Thread.sleep(2000);
	    driver.findElement(By.className("confirm")).click();
	    
	   
	    //Campus Post
	    driver.findElement(By.xpath("//button[@class='btn btn-warning btn-block']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//label/input[@value='Internship']")).click();
	    driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	    driver.findElement(By.xpath("//label/input[@value=\"3\"]")).click();
	    driver.findElement(By.id("show")).click();
	    Thread.sleep(1000);
	    
	   /* driver.findElement(By.xpath(".//*[@id='page-top']/div[1]/div/div/div/div[2]/form/div[3]/div/div/div/button")).click();  
	    driver.findElement(By.xpath(".//*[@id='page-top']/div[1]/div/div/div/div[2]/form/div[3]/div/div/div/ul/li[18]/a/label")).click();
	    driver.findElement(By.id("show12")).click();
	    */
	    
	    driver.findElement(By.id("exampleInputPositions")).sendKeys("3");
	    driver.findElement(By.className("col-md-2")).click();
	    
	    
	    
	    driver.close();
	}

}
