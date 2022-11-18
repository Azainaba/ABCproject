package assertion;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assert_True {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\eclipse-workspace\\ABCproject\\driver\\chromedriver_win32\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		boolean logo = driver.findElementByXPath("//div[@id='logo']/img").isDisplayed();
		Assert.assertTrue(logo, "isDisplayed");
		if(logo==true) {
			System.out.println("logo visible");
		}else {
			System.out.println("logo is not visible");
		}
		driver.findElementByXPath("//input[@ id='username']").sendKeys("DemoSalesManager");
		
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
		//driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/S')]").click();
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
	 	
		//Take SnapShot or ScreenShot
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		//Path Location-1,Where it will store after moved
		//File dest = new File("C:\\Users\\ahmed\\Desktop\\Snaps\\image.png");
		
		//Path Location-2,Where it will store after moved
		File dest = new File("./snap02/image.png");
		
		//moved File source to destination(image or image file)
		FileUtils.copyFile(src, dest);
		
		//driver.quit();
		
	}

}
