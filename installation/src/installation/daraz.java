package installation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.*;

public class daraz {
	
	static String BS  = "https://www.google.com";
	static String userNameInputField = "//html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/input[1]";
	static String nextButton = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div[4]/div/div/div/div[2]/input";
	static String passwordInputField = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/input";
	static String submitButton = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input";
	static String verifyButton = "/html/body/div/form/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[6]/div/div/div/div[2]/input";
	static String verficationCodeSms = "div.page.js-page:nth-child(3) div.header-back.header-back-light.header-back-small.header-img:nth-child(3) div.background-gradient-grey.mh-2100 div.container1.content-inner.cs1s:nth-child(3) div.row.smrig div.spadng div.layout.with-right-sidebar.js-layout.llayoutsi div.col-md-9.s74 div.main-content:nth-child(1) div.list-view table.table.table-bordered.wrptable.tbdif tbody:nth-child(2) tr:nth-child(1) td.wrpc5sel121:nth-child(5) span.btncp1 > b:nth-child(1)";
	static String verificationCodeField = "/html/body/div/form/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div/div[3]/div/input";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    
		 	driver.get("https://sales-hub-uat.azureedge.net/");  
		 	
		 		
			//Applying Implicit wait to ensure that screen site loads up before next script is executed
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 	
		 	WebElement UN =  driver.findElement(By.xpath(userNameInputField));
			UN.sendKeys("mustafa.waris@iwgplc.com");
		 	
		 	
		 	WebElement SH = driver.findElement(By.xpath(nextButton));
			SH.click();
			WebElement SB = driver.findElement(By.xpath(passwordInputField));
			SB.sendKeys(">N0u6@*GJ22tLy9");
			WebElement Sub = driver.findElement(By.xpath(submitButton));
			Sub.click();
			Thread.sleep(17000);
		    
		    
		    ((JavascriptExecutor)driver).executeScript("window.open()");
		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    driver.get("https://receive-smss.com/sms/447868150810/");	    
		    
		    
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		    jse.executeScript("window.scrollBy(0,600)");
		    
		    String vCodeSms = driver.findElement(By.cssSelector(verficationCodeSms)).getText();
		    
		    
		  //Switch back to First Tab
			ArrayList<String> tabs_list = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs_list.get(0)); 
			Thread.sleep(2000);
			//Code for First Tab
			WebElement vCodeField = driver.findElement(By.xpath(verificationCodeField));
			vCodeField.sendKeys(vCodeSms);
	   	    
	    	}

}
