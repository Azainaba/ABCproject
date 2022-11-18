package connectExcellWithDataProvider_02;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import utils.ReadExcel;



public class ProjectSpecificWrapper_02 {

	
public ChromeDriver driver;
		
		@Parameters({"url","uname","pwd"})
			
			@BeforeMethod
			public void login(String url,String uname, String pwd) { 

				System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();

				//maximize
				driver.manage().window().maximize();

				//load URL
				driver.get(url); 

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				//Enter Username - (Element level)
				driver.findElementById("username").sendKeys(uname);

				//Enter Password - (Element level)
				driver.findElementById("password").sendKeys(pwd);

				// Click Login Button - (Element level)
				driver.findElementByClassName("decorativeSubmit").click();

				// click crm.sfa link
				driver.findElementByLinkText("CRM/SFA").click();

			}
		@DataProvider
		
		public String[][] getData() throws IOException{
			ReadExcel r1 = new ReadExcel();
			return r1.readExcel();
		
		}
			
			@AfterMethod
			public void closeBrowser() { 
				driver.close();
			
			}
			
			
			

			
			
			//public String[][] getData() throws IOException {
			//ReadExcel r1 = new ReadExcel();
			//return r1.readExcel();
			
			/*String[] [] data = new String [3][3];
			
			data [0][0] = "TCS";
			data [0][1] = "Ayan";
			data [0][2] = "Ahmed";
			
			data[1][0] = "ABC";
			data[1][1] = "Arin";
			data[1][2] = "Khan";
			
			data[2][0] = "XYZ";
			data[2][1] = "Anon";
			data[2][2] = "Rafique";
			
			return data;//add return Data*/
			}



