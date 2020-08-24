package installation;

import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.*;


public class znd {
	
	static String KIB = "/html/body/div[4]/div[3]/div[2]/div[2]/a[1]";
	static String Search = "/html/body/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/form/div/div[1]/input[1]";
	static String SubmitBTN = "//*[@id=\"topActionHeader\"]/div[1]/div[2]/div/div[2]/form/div/div[2]/button";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver drv = new  ChromeDriver();
		
		//Fetching URL and Opening 
		
		String BaseURL = "https://www.daraz.pk/#hp-flash-sale";
		drv.get(BaseURL);
		
		
		
		//Maximize Screen
		drv.manage().window().maximize();
		
		//Applying Implicit wait to ensure that screen site loads up before next script is executed
		
		drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement PS =  drv.findElement(By.xpath(KIB));
		
		
		PS.click();
		
		
		// Accessing Search Bar and adding copy in Search Bar and Tapping on Search Button
		WebElement SH = drv.findElement(By.xpath(Search));
		SH.sendKeys("Charger");
		
		WebElement SB = drv.findElement(By.xpath(SubmitBTN));
		SB.click();

	}

}
