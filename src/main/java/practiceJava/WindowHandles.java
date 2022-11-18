package practiceJava;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click on Try it Yourself  
		driver.findElementByLinkText("Try it Yourself »").click();
		//Get window handle() -to return first window
		String firstWin = driver.getWindowHandle();
		System.out.println(firstWin);  
		//get both Window Reference
		Set<String> bothWinRef = driver.getWindowHandles();
		System.out.println(bothWinRef);  
		//Switching 1st widow to 2nd window
		for(String eachWin:bothWinRef) {
			System.out.println(eachWin);
			WebDriver getTitle = driver.switchTo().window(eachWin);
			System.out.println(driver.getTitle());
			driver.quit();
		}
		
		

		
	}

}
