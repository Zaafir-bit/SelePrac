package installation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {


	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\KDS\\Downloads\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			String baseUrl = "https://artoftesting.com/sampleSiteForSelenium.html" ;
			driver.get(baseUrl);
			
			WebElement element = driver.findElement(By.id("male"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500); 
			
			 WebElement testDropDown = driver.findElement(By.id("testingDropdown"));
			
			 Select dropdown = new Select(testDropDown);
			
			 dropdown.selectByVisibleText("Manual Testing");
			
			 Thread.sleep(3000);
			
			 dropdown.selectByValue("Database");
			
			 Thread.sleep(3000);

			 dropdown.selectByIndex(1);
			 
			 
			 
			 
			
			
			
		  
}
		
}


