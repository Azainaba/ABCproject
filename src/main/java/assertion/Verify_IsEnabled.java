package assertion;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\eclipse-workspace\\ABCproject\\driver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
	    boolean enabled = driver.findElementByXPath("//label[text()='Save this User ID']").isEnabled();
		
		System.out.println(enabled);
		if(enabled==true) {
			System.out.println("is enabled");
			
		}else {
			System.out.println("is not enabled");
		}
		driver.close();

	}

}
