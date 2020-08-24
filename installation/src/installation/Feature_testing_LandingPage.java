package installation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feature_testing_LandingPage {

	static WebDriver driver; // Creating Object of WebdDriver class with driver instance and instantiating it with ChromeDriver Method
    static String HXP = "//*[@id=\"login-personal\"]/div[3]/div[1]/h3";	 //Creating Variables for Xpath 
    static String PXP = "//*[@id=\"login-personal\"]/footer/div/a[1]";
    static String TXP = "//*[@id=\"login-personal\"]/footer/div/a[2]";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
							
		driver = new ChromeDriver(); //Opening Chrome Browser
		driver.manage().window().maximize(); //maximize browser window
		// Open Hub landing page
    	driver.navigate().to("https://stg1.hub.internal.yoti.com/login");
		
		
		
		//Calling Heading method in an If statement and printing it in console
		// Using main block to create and print test scenarios 
		
		if (MainHeading()) {
			
			System.out.println("Heading is Correct");
		}
		
		else {
			
			System.out.println("Heading is incorrect");
			
		}
		
		String S = driver.findElement(By.xpath(HXP)).getText();	
		System.out.println(S);
		
		switch (S)
		
		{
			case "":
				
			
				driver.findElement(By.xpath(PXP)).click();
				break;
				
			case "Welcome to Yoti Hub":	
				
				driver.findElement(By.xpath(TXP)).click();
				break;
				
				default:
				System.out.println("heading is not matching to anything");

		
		}
	}
	
	
	//Good Practice to create a seperate method outside Main function block makes code readable and reuseable
	
	
	
	
	 private static boolean MainHeading() {
		
        try {
        	
        	String Heading = "Welcome to Yoti Hub"; // Main Heading Landing page
        	    
      
            // Check whether the Heading element equals “Heading”
            if (driver.findElement(By.xpath(HXP)).getText()
                    .equals(Heading)) {
                return true;
            } else {
                return false;
            }

        // If anything goes wrong, return false.
        } catch (final Exception e) {
            System.out.println(e.getClass().toString());
            return false;
        }
    }
	 
//	 private static boolean Title() {
//		 
//		 try { 
//			 
//			 String Title = "Yoti | Hub"; // Title of the Landing Page
//			 
//			 // Check whether title matches that of title in the mentioned in string var
//			 if (driver.findElement(arg0))
//			 
//		 }
//		 
//		 catch () {
//			 
//			 
//		 }
//			 
			 
			 
		 }
		 
	 
	

