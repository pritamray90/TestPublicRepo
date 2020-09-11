package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterUsernamePage extends BasePage{
	
	@FindBy(id=Constants.LOGIN_ID)
	WebElement loginUsername;
	
	@FindBy(css=Constants.NEXT_BUTTON)
	WebElement nextButton;
	
	public EnterUsernamePage(WebDriver driver) {
		super(driver);
	}
	
	public void submitUsername(String userid) {
		
		//validate
		loginUsername.sendKeys(userid);
		// explicit wait
		nextButton.click();
		
		// remain on EnterUsernamePage
		// reach the EnterPasswordPage
	}
	
	
	


}
