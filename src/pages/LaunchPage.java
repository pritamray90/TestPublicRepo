package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage extends BasePage{
	
	public LaunchPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage navigateToHomePage() {
		
		driver.get("http://zoho.com");
		return new HomePage(driver);
		// create object - HomePage
		// pass the driver
		// initializes objects
		//return PageFactory.initElements(driver, HomePage.class);
	}
	
	public void goToRegisterPage() {
		
	}

}
