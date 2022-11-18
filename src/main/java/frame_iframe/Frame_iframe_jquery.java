package frame_iframe;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_iframe_jquery {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.findElementByXPath("//a[text()='Selectable']").click();
		try {
			driver.findElementByXPath("//a[text()='Selectable1']").click();
			System.out.println("selectable button is working");
		}catch(Exception e) {
			System.out.println("selectable button is not working");
		}
		
        finally {
        	File src = driver.getScreenshotAs(OutputType.FILE);
        	File dest = new File("./snap02/img11.png");
        	FileUtils.copyFile(src, dest);
        }
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
	}

}
