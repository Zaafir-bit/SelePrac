package installation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



@Test
public class contactTest {
	
	static String userNameInputField = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/input[1]";
	static String nextButton = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div[4]/div/div/div/div[2]/input";
	static String passwordInputField = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/input";
	static String submitButton = "/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input";
	static String verifyButton = "/html/body/div/form/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[6]/div/div/div/div[2]/input";
	
	static String contactsButton = "/html/body/div[1]/div/nav/ul/li[4]/a";
	static String addContactIcon = "//div[@id='root']//div//div//main//div//header//div//span//button";
	static String contactTypeDropDown = "//body//div[@id='root']//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]";
	static String contactTypeCustomer = "/html/body/div[1]/div/div/main/div/div[3]/div[2]/div/div/div/form/div[1]/div/div/div/ul/li[1]";
	static String contactsTitleDropDown = "//body//div[@id='root']//div//div//div//div//div//div[2]//div[1]//div[1]//div[1]//div[1]//input[1]";
	static String titleMr = "/html/body/div[1]/div/div/main/div/div[3]/div[2]/div/div/div/form/div[2]/div[1]/div/div/ul/li[1]";
	static String inputFirstName = "//input[@id='firstname']";
	static String inputSurName = "//input[@id='surname']";
	static String inputEmailAddress = "//input[@id='email']";
	static String inputPhoneNumber = "//input[@id='phoneNumber']";
	static String genderRadioButtom = "//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//label[1]";
	static String countryDropDown = "//div[5]//div[2]//div[1]//div[1]//div[1]//input[1]";
	static String countryUK = "/html/body/div[1]/div/div/main/div/div[3]/div[2]/div/div/div/form/div[5]/div[2]/div/div[1]/ul/li";
	static String saveCTA = "//button[contains(text(),'Save')]";
	static String successMessage = "//span[contains(text(),'Contact created successfully')]";
	static String emailAddressField = "/html/body/div[1]/div/div/main/div[2]/div[2]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[4]";
	WebDriver drv;
	
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver drv = new  ChromeDriver();
	
		//Fetching URL and Opening 
		
		String BaseURL = "https://sales-hub-test.azureedge.net/";
		drv.get(BaseURL);

		drv.manage().window().maximize();
	}
	
	@Test
	public void contact() throws InterruptedException {
		
		drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement UN =  drv.findElement(By.xpath(userNameInputField));
		UN.sendKeys("mustafa.waris@iwgplc.com");
		
		WebElement SH = drv.findElement(By.xpath(nextButton));
		SH.click();
		WebElement SB = drv.findElement(By.xpath(passwordInputField));
		SB.sendKeys(">N0u6@*GJ22tLy9");
		WebElement Sub = drv.findElement(By.xpath(submitButton));
		Sub.click();
				
		WebElement verf = drv.findElement(By.xpath(verifyButton));
		Thread.sleep(20000);
		verf.click();
		
		drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement contacts = drv.findElement(By.xpath(contactsButton));
		contacts.click();
		
		WebElement addContacts = drv.findElement(By.xpath(addContactIcon));
		addContacts.click();
		
		drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement contactDD =  drv.findElement(By.xpath(contactTypeDropDown));
		contactDD.click();
		
		WebElement customerDD = drv.findElement(By.xpath(contactTypeCustomer));
		customerDD.click();
		System.out.println("Individual Contact Type: " + contactDD.getAttribute("value"));
		
		WebElement titleDD = drv.findElement(By.xpath(contactsTitleDropDown));
		titleDD.click();
		
		WebElement mrDD = drv.findElement(By.xpath(titleMr));
		mrDD.click();
		System.out.println("Individual Title: " + titleDD.getAttribute("value"));
		
		WebElement firsName = drv.findElement(By.xpath(inputFirstName));
		firsName.sendKeys("Jack");
		System.out.println("Individual First Name: " + firsName.getAttribute("value"));
		WebElement surName = drv.findElement(By.xpath(inputSurName));
		surName.sendKeys("Tester");
		System.out.println("Individual Sur Name: " + surName.getAttribute("value"));
		WebElement emailAddress = drv.findElement(By.xpath(inputEmailAddress));
		emailAddress.sendKeys("tareenity_1@gmail.com");
		System.out.println("Individual Email Address on the Form: " + emailAddress.getAttribute("value"));
		String email1 = emailAddress.getAttribute("value");
		WebElement phoneNumber = drv.findElement(By.xpath(inputPhoneNumber));
		phoneNumber.sendKeys("+44 1434 634996");
		System.out.println("Individual Phone Number: " + phoneNumber.getAttribute("value"));
		
		WebElement genderMale = drv.findElement(By.xpath(genderRadioButtom));
		genderMale.click();
		System.out.println("Individual Gender: " + genderMale.getAttribute("for"));
		
		WebElement countrySelect = drv.findElement(By.xpath(countryDropDown));
		countrySelect.sendKeys("United Kingdom");
		WebElement ukSelect = drv.findElement(By.xpath(countryUK));
		ukSelect.click();
		System.out.println("Individual Country: " + countrySelect.getAttribute("value"));
		
		WebElement saveButton = drv.findElement(By.xpath(saveCTA));
		saveButton.click();
		
		drv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement msgSuccess = drv.findElement(By.xpath(successMessage));
		System.out.println(msgSuccess.getText());
		msgSuccess.isDisplayed();
		
		WebElement emailField = drv.findElement(By.xpath(emailAddressField));
		System.out.println("Email address on the Individual page: " + emailField.getText());
		String email2 = emailField.getText();
		
		if(email1.equals(email2))
		  {
		  System.out.println("Contact successfully created");
		  }
		  else
		  {
		  System.out.println("Contact not created successfully");
		  }	
		
	}
	
}