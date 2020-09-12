package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterUsernamePage extends BasePage{
	
	@FindBy(id=Constants.LOGIN_ID)
	WebElement loginUsername;
	
	@FindBy(id=Constants.PWD)
	WebElement loginPassword;
	
	@FindBy(css=Constants.NEXT_BUTTON)
	WebElement nextButton;
	
	public EnterUsernamePage(WebDriver driver) {
		super(driver);
	}
	
	public CartPage submitUsername(String userid,String password) {
		
		//validate
		loginUsername.sendKeys(userid);
		// explicit wait
		loginPassword.sendKeys(password);
		
		nextButton.click();
		
		return new CartPage(driver);
		
		// remain on EnterUsernamePage
		// reach the EnterPasswordPage
	}
	
	
	


}
