package installation;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.*;


public class SalesHub {
	
	static String UserName = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/input[1]";
	static String Next = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div[4]/div/div/div/div[2]/input";
	static String Password = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/input";
	static String Submit = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input";
	static String verficationCodeSms = "div.page.js-page:nth-child(3) div.header-back.header-back-light.header-back-small.header-img:nth-child(3) div.background-gradient-grey.mh-2100 div.container1.content-inner.cs1s:nth-child(3) div.row.smrig div.spadng div.layout.with-right-sidebar.js-layout.llayoutsi div.col-md-9.s74 div.main-content:nth-child(1) div.list-view table.table.table-bordered.wrptable.tbdif tbody:nth-child(2) tr:nth-child(1) td.wrpc5sel121:nth-child(5) span.btncp1 > b:nth-child(1)";
	static String Verify = "//input[@id='idTxtBx_SAOTCC_OTC']";
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver drv = new  ChromeDriver();
		
		//Fetching URL and Opening 
		
		String BaseURL = "https://sales-hub-uat.azureedge.net/";
		drv.get(BaseURL);
		
		
		
		//Maximize Screen
		drv.manage().window().maximize();
		
		//Applying Implicit wait to ensure that screen site loads up before next script is executed
		
		drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement UN =  drv.findElement(By.xpath(UserName));

		UN.sendKeys("mustafa.waris@iwgplc.com");
//		Hitting Next CTA
	
		WebElement SH = drv.findElement(By.xpath(Next));
		SH.click();
//		
		WebElement SB = drv.findElement(By.xpath(Password));
		SB.sendKeys(">N0u6@*GJ22tLy9");
//
		
		WebElement Sub = drv.findElement(By.xpath(Submit));
		Sub.click();
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)drv).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(drv.getWindowHandles());
	    drv.switchTo().window(tabs.get(1));
	    drv.get("https://receive-smss.com/sms/447868150810/");
	    Thread.sleep(3000);
	    drv.navigate().refresh();
	    
	    
	    JavascriptExecutor jse = (JavascriptExecutor)drv;
	    jse.executeScript("window.scrollBy(0,700)");
	    
	    Thread.sleep(5000);
	    
	    drv.navigate().refresh();
	    JavascriptExecutor jsea = (JavascriptExecutor)drv;
	    jse.executeScript("window.scrollBy(0,700)");
	    
	    
	    String vCodeSms = drv.findElement(By.cssSelector(verficationCodeSms)).getText();
	    
	    
	  //Switch back to First Tab
		ArrayList<String> tabs_list = new ArrayList<String> (drv.getWindowHandles());
		drv.switchTo().window(tabs_list.get(0)); 
		Thread.sleep(2000);
		
		//Code for First Tab
		WebElement vCodeField = drv.findElement(By.xpath(Verify));
		vCodeField.sendKeys(vCodeSms);
		
		Thread.sleep(5000);
		
		
		WebElement ver = drv.findElement(By.xpath("//input[@id='idSubmit_SAOTCC_Continue']"));
		ver.click();
	

}
}