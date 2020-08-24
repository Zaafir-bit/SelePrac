package installation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class FileHandling {

	
	public static void main(String[] args) 
	{
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Upload file from Guru99
		
		String baseUrl = "https://ps.uci.edu/~franklin/doc/file_upload.html";
		
		driver.get(baseUrl);
		
		WebElement uploadElement = driver.findElement(By.name("userfile"));
		
		//Enter File path onto the file-selection input field 
		uploadElement.click();

		//Check "I accept terms and service" check box
//		driver.findElement(By.id("terms")).click();
		
		// Click the "UploadFile" Button 
		driver.findElement(By.name("submit")).click();
		
	}
	
}