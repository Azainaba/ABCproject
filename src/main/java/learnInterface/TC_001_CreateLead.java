package learnInterface;

import org.testng.annotations.Test;

public class TC_001_CreateLead extends GenericWrapper {
  
	@Test
	
	public void CreateLead() {
		
		login("http://leaftaps.com/opentaps/control/main");
		
		enterByID("username", "DemoSalesManager");
		enterByXpath("//input[@id='password']", "crmsfa");
		//ClickByXpath("//input[]@value='Login'");
		ClickByClassName("decorativeSubmit");
		ClickByLinkText("CRM/SFA");
		ClickByLinkText("Create Lead");
		enterByID("createLeadForm_companyName", "TCS");
		enterByID("createLeadForm_firstName", "Hema");
		enterByID("createLeadForm_lastName", "Mali");
		
		
		
	}
}
