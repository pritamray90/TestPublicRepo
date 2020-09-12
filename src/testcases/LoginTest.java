package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.EnterUsernamePage;
import pages.HomePage;
import pages.LaunchPage;
import pages.SubmitPage;

public class LoginTest {
	// passing of driver object
	// other objects
	// base page class size
	@Test
	public void loginTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\Pritam\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launching the LaunchPage
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		LaunchPage lp = new LaunchPage(driver);// init launchpage... send driver
		HomePage hp = lp.navigateToHomePage();// home page driver is ready
		//hp.validateTitle("xxxxxx");
		EnterUsernamePage usernamePage= hp.gotoLoginPage();
		usernamePage.submitUsername("uname@gmail.com","password");
		CartPage cp = new CartPage(driver);
		//call the methods in cart page
		SubmitPage sp = cp.CartPage();
		//call the methods in submit page
		
	}

}
