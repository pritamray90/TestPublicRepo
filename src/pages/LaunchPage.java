package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage extends BasePage{
	
	public LaunchPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage navigateToHomePage() {
		
		driver.get("http://www.amazon.com");
		return new HomePage(driver);
	}
}
