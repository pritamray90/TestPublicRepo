package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
	
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	public SubmitPage CartPage() {
		
		//Add locators for CartPage
		
		return new SubmitPage(driver);
		//return PageFactory.initElements(driver, HomePage.class);
	}
}
