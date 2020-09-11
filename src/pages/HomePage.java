package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	@FindBy(css =Constants.LOGIN_LINK)
	WebElement loginLink;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public EnterUsernamePage gotoLoginPage() {
		loginLink.click();
		return new EnterUsernamePage(driver);
		//return PageFactory.initElements(driver, EnterUsernamePage.class);
	}
	
	

}
