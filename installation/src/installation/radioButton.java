package installation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

//Radio Button, checkboxes using for loops to check for Fb persist checkbox and returning true and false statement accordingly


public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Interrupted Exception is for adding wait between the clicks so that user is able to view automated steps easily || wait induced for 3 seconds 
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://demo.guru99.com/test/radio.html");
	    WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
	    WebElement radio2 = driver.findElement(By.id("vfb-7-2")); 
	    WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
	    // Select Radio1 button
	    radio1.click();
        System.out.println("Radio Button 1 selected"); 
        Thread.sleep(3000);
        
        
        //Radio button 1 is de-selected and radio button 2 is selected
        radio2.click();
        System.out.println("Radio Button 2 selected");
        Thread.sleep(3000);
        
        //Radio button 2 is deslected and radio button 3 is selected
        radio3.click();
        Thread.sleep(3000);
        
        //Selecting checkBox
        
        WebElement checkBox = driver.findElement(By.id("vfb-6-0"));
       
        //This will toggle check box 
        
        checkBox.click();

        // Checking whether option 1 is toggled on 
        
        if(checkBox.isSelected())
        	
        {
        	
        	System.out.println("Check Box is toggled on");
        }
        
        else {
			
        	System.out.println("Checkbox is toggled off");
		}
        
        
        
	  //Selecting checkBox using click method and checking the selection using isSelected mehtod with if statement
		
        driver.get("https://demo.guru99.com/test/facebook.html");
        WebElement checkFBPersist = driver.findElement(By.id("persist_box"));
        
        for (int i=0; i < 2; i++)
        {
        	
        	checkFBPersist.click();
            System.out.println("Face Persist check box Status is - " +checkFBPersist.isSelected());
            Thread.sleep(3000);
        }
        
        Thread.sleep(3000);
        driver.close();
        

	}

}
