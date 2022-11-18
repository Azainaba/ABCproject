package learnInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods{
	
	public ChromeDriver driver;
	
	//public void LaunchBrowser(String Url)/login same{ }

	public void login(String url) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Chrome browser launch successfully");
		
	}

	public void enterByID(String locatorvalue, String data) {
		driver.findElementById(locatorvalue).sendKeys(data);
	}

	public void enterByName(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);
		
	}

	public void enterByClassName(String locatorValue, String data) {
		driver.findElementByClassName(locatorValue).sendKeys(data);
		
	}

	public void enterByLinkText(String locatorValue, String data) {
		driver.findElementByLinkText(locatorValue).sendKeys(data);
	}

	public void enterByPartialLinkText(String locatorValue, String data) {
		driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
		
	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);
	}

	public void enterByCssSelector(String locatorValue, String data) {
		driver.findElementByCssSelector(locatorValue).sendKeys(data);
	}

	public void ClickById(String locatorValue) {
		driver.findElementById(locatorValue).click();
		
	}

	public void ClickByName(String locatorValue) {
		driver.findElementByName(locatorValue).click();
		
	}

	public void ClickByClassName(String locatorValue) {
		driver.findElementByClassName(locatorValue).click();
		
	}

	public void ClickByLinkText(String locatorValue) {
		driver.findElementByLinkText(locatorValue).click();
		
	}

	public void ClickByPartialLinkText(String locatorValue) {
		driver.findElementByPartialLinkText(locatorValue).click();
		
	}

	public void ClickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue).click();
		
	}

	public void ClickByCssSelector(String locatorValue) {
		driver.findElementByCssSelector(locatorValue).click();
		
	}

	public void selectVisibleTextById(String id, int Value) {
		WebElement element = driver.findElementById(id);
		Select dd = new Select(element);
		dd.selectByIndex( Value);
	}

	public void selectIndexByName(String Name, int Value) {
		WebElement element = driver.findElementByName(Name);
		Select dd = new Select(element);
		dd.deselectByIndex(Value);
	}

	public void getTextByid(String id) {
		WebElement Text = driver.findElementById(id);
		System.out.println(Text);
		
	}
	
	
		
	 public void verifyTextByid(String id, String Text) {
		String text2 = driver.findElementById(id).getText();
		if(text2.equals(Text)) {
			System.out.println("Text is matched");
		}else {
			System.out.println("Text is not matched");
		}
		
		
	}



	public void closeBrowser() {
		driver.close();
	}

	
}