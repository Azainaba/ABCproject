package assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertEquals_Title {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\eclipse-workspace\\ABCproject\\driver\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("http://leaftaps.com/opentaps/control/main");
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Leaftaps - TestLeaf Automation Platform");
			
			if(title.equals("Leaftaps - TestLeaf Automation Platform")) {
				System.out.println("Title Matched");
				
			}else {
				System.out.println("Title not Matched");
			}
			driver.findElementByXPath("//input[@ id='username']").sendKeys("DemoSalesManager");
			
			driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
			//driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
			driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
			driver.findElementByXPath("//a[contains(text(),'CRM/S')]").click();
			
			driver.findElementByXPath("//a[text()='Create Lead']").click();
			
			driver.quit();
			

	}

}
