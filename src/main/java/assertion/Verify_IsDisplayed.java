package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verify_IsDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\eclipse-workspace\\ABCproject\\driver\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		/*driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		
	     boolean logo = driver.findElementByXPath("//div[@id='logo']/img").isDisplayed();
	     
        System.out.println(logo);
        
		if(logo==true) {
			System.out.println("logo is displayed");
			
		}else {
			System.out.println("logo is not displayed");
		}
		
		driver.findElementByXPath("//input[@ id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
		//driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/S')]").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();*/
		
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//load Url
		driver.navigate().to("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		//get Title of the page
		String title = driver.getTitle();
		System.out.println(title);
		//Assertion
		Assert.assertEquals(title, "Bank of America | Online Banking | Log In | User ID","Verify page Title");
		boolean logo = driver.findElement(By.xpath("//img[@alt='Bank of America']")).isDisplayed();
		System.out.println(logo);
		//Assertion
		Assert.assertTrue(logo, "logo is displayed");
		//isEnabled() -Get The AppLink is Enable(true/false)
		boolean getTheAppLink = driver.findElement(By.xpath("//a[@id='choose-device-get-the-app']")).isEnabled();
		System.out.println(getTheAppLink);
		
		if(getTheAppLink==true) {
			System.out.println("getTheAppLink is Enabled");
		}else {
			System.out.println("getTheAppLink is not Enabled");
		}
		
		//isSelected();-to do this validation we can use only -RadioButton, a CheckBox &Drop-Down
		//1St click the "Save this online Id CheckBox"(select) then verify isSelected() otherwise
		driver.findElement(By.xpath("//div[@class='remember-info']/input")).click();
		
		boolean saveThisOnlineIdCheckBox = driver.findElement(By.xpath("//div[@class='remember-info']/input")).isSelected();
		System.out.println(saveThisOnlineIdCheckBox);
			//Assertion
		Assert.assertTrue(saveThisOnlineIdCheckBox,"saveThisOnlineIdCheckBox is Selected");
		//Validation
		if(saveThisOnlineIdCheckBox==true) {
			System.out.println("CheckBox is Selected");
			
		}else {
			System.out.println("CheckBox is not Selected");
		}
			driver.close();

	}

}
