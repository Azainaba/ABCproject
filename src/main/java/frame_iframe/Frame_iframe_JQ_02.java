package frame_iframe;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_iframe_JQ_02 {


		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://jqueryui.com/");
			driver.findElementByXPath("//a[text()='Selectable']").click();
			try {
				driver.findElementByXPath("//a[text()='Selectable']").click();
				System.out.println("selectable button is working");
			}catch(Exception e) {
				System.out.println("selectable button is not working");
			}
			
	        finally {
	        	File src = driver.getScreenshotAs(OutputType.FILE);
	        	File dest = new File("./snap02/img12.png");
	        	FileUtils.copyFile(src, dest);
	        }
			driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
			driver.findElementByXPath("(//ol[@id='selectable']/li)[1]").click();
			driver.findElementByXPath("(//ol[@id='selectable']/li)[2]").click();
			driver.findElementByXPath("(//ol[@id='selectable']/li)[3]").click();
			driver.findElementByXPath("(//ol[@id='selectable']/li)[4]").click();
			driver.findElementByXPath("(//ol[@id='selectable']/li)[5]").click();
			driver.findElementByXPath("(//ol[@id='selectable']/li)[6]").click();
			driver.findElementByXPath("(//ol[@id='selectable']/li)[7]").click();
		}
	}


