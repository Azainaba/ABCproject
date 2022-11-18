package javaTC_WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatLead {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		

		
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@ id='username']").sendKeys("DemoSalesManager");
	
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
		//driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/S')]").click();
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
				
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
				
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
				
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");

		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("MS");	
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("TCS");
		driver.findElementByXPath("//input[@value='1']").clear();	
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@value='1']").sendKeys("1");
		driver.findElementByXPath("//input[@name='departmentName']").sendKeys("MKT");
		//Enter Number of Employee by Using XPath***
		Thread.sleep(3000);
	
		driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("https://www.google.com/");
		driver.findElementByXPath("//input[@name='generalCity']").sendKeys("PHOENIX");	
	
		WebElement state = driver.findElementByXPath("//select[@name='generalStateProvinceGeoId']");
		Select dd4 = new Select(state);//*****************************************************************************************
		dd4.selectByVisibleText("Arizona");//*************************************************************************************
	
		WebElement country = driver.findElementByXPath("//select[@name='generalCountryGeoId']");
		Select dd5 = new Select(country);//***************************************************************************************
		dd5.selectByVisibleText("United States");//*******************************************************************************
	
		driver.findElementByXPath("//input[@name='generalPostalCode']").sendKeys("75061");	
	
		WebElement campaign = driver.findElementByXPath("//select[@name='marketingCampaignId']");
		Select dd6 = new Select(campaign);//**************************************************************************************
		dd6.selectByVisibleText("Automobile");//**********************************************************************************
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("123456");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("abc@gmail.com");
		Thread.sleep(3000);//******************************************************************************************************
		driver.findElementByXPath("//input[@type='submit']").click();	//Click Creat Lead 
		//WebDriverWait
		//WebDriverWait wait =new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
		driver.close();
	
	}

	}


