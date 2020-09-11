package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.EnterUsernamePage;
import pages.HomePage;
import pages.LaunchPage;

public class LoginTest {
	// passing of driver object
	// other objects
	// base page class size
	// object validations
	// multiple return types from a function/action
	// Pagefactory Design Pattern - passing the driver,create object, init of elements/objects
	
	// no need - driver.findElement
	@Test
	public void loginTest() {
		//ExtentReports
		//rep.log("starting test");
		System.setProperty("webdriver.chrome.driver", "D:\\Ashish\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launching the LaunchPage
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		LaunchPage lp = new LaunchPage(driver);// init launchpage... send driver
		//LaunchPage lp = PageFactory.initElements(driver, LaunchPage.class);
		HomePage hp = lp.navigateToHomePage();// home page driver is ready
		//hp.validateTitle("xxxxxx");
		EnterUsernamePage usernamePage= hp.gotoLoginPage();
		usernamePage.submitUsername("se.leniumtraining10@gmail.com");
		
		
		
		//driver.get("http://yahoo.com");
	}

}
