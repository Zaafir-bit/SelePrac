package installation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.facebook.com/login/identify?ctx=recover";
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click(); 
		
		//verify that we are now back on Facebook's homepage
		
		if (driver.getTitle().contentEquals("Facebook – log in or sign up")) {
			
			System.out.println("We are back at Facebook page");
			
		}else {
			
			System.out.println("We are NOT in facebook's homepage");
		}
		
		driver.close();
		
		
		
	}

}
