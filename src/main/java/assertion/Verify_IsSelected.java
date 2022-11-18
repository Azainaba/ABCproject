package assertion;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_IsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\eclipse-workspace\\ABCproject\\driver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		boolean selected = driver.findElementByXPath("//label[text()='Save this User ID']").isSelected();
		System.out.println(selected);
		if(selected==true) {
			System.out.println("is selected");
			
		}else {
			System.out.println("is not selected");
		}
		driver.close();

	}

}
