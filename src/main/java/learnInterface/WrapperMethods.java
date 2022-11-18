package learnInterface;

public interface WrapperMethods {
	//100% abstract methods
	public void login (String url);
	
	public void enterByID(String locatorvalue, String data);
	public void enterByName(String locatorValue, String data);
	public void enterByClassName(String locatorValue, String data);
	public void enterByLinkText(String locatorValue, String data);
	public void enterByPartialLinkText(String locatorValue, String data);
	public void enterByXpath(String locatorValue, String data);
	public void enterByCssSelector(String locatorValue, String data);
	
	public void ClickById(String locatorValue);
	public void ClickByName(String locatorValue);
	public void ClickByClassName(String locatorValue);
	public void ClickByLinkText(String locatorValue);
	public void ClickByPartialLinkText(String locatorValue);
	public void ClickByXpath(String locatorValue);
	public void ClickByCssSelector(String locatorValue);
	
	public void selectVisibleTextById(String id, int Value);
	public void selectIndexByName(String Name, int Value);
	public void getTextByid(String id);
	
	public void verifyTextByid(String id, String Text);
	
	public void closeBrowser();
	
	

}
