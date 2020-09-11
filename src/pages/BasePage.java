package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage {
	WebDriver driver;
	public BasePage() {
		System.out.println("Base Page Constructor");
	}
	
	// page is init
	public BasePage(WebDriver driver) {
		// screenshot
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void validateTitle(String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
	
	// 1000s of validations
	// validations - validateTitle,validateElementPresence, validateText
	// applicatons - validateSession
	// reporting, screenshots
}
