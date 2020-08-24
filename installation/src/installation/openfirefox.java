package installation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KDS\\Downloads\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		
//		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KDS\\Documents\\chromedriver.exe");
		WebDriver drv = new  ChromeDriver();
		
		drv.get("https://www.learn-automation.com");
		System.out.println(drv.getTitle());
		
//		String baseUrl = "http://preprod0.www.yoti.com/business" ;
//		driver.get(baseUrl);
//		
//		String actualTitle = driver.getTitle();
//		
//		System.out.println(actualTitle);
//		
//		String expectedTitle = "Yoti | Business";
//		
//		
//		if(actualTitle.contentEquals(expectedTitle)) {
//			
//			System.out.println("Test Case Passed");
//		}
//		
//		else {
//			
//			System.out.println("Test Case Failed");
//		}
//		
//	  driver.findElement(By.xpath("///*[@id=\"yoti-for-business\"]/div[5]/div/div[1]/h2"));
//		
//		
////		WebElement homelink = driver.findElement(By.name("q"));           //Searching Tareenity website on google chrome
////		
////		homelink.sendKeys("Tareenity");
////		
////		WebElement search = driver.findElement(By.name("btnK"));
////		
////		search.submit();
//		
		

	} 
	
}
