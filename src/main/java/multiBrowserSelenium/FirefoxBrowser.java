package multiBrowserSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowser {
	//@Test
	//public void test3() throws InterruptedException {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);
		//Enter 'facebook login'in Google search box
		driver.findElement(By.name("q")).sendKeys("facebook login");
		Thread.sleep(2000);
		driver.quit();

		
	}

}
