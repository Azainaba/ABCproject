package multiBrowserSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	
	
	//@Test
	//public void test1() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
	//WebDriverManager.edgedriver().setup();
	//WebDriver driver = new EdgeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriverManager.iedriver().setup();
		//WebDriver driver = new InternetExplorerDriver();
		
		
		
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println(title);
	//Enter 'facebook login'in Google search box
	driver.findElement(By.name("q")).sendKeys("facebook login");
	Thread.sleep(2000);
	driver.quit();

}
}