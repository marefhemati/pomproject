package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		By PRODUCT_FIELD = By.xpath("//span[contains(text(),'Products')]");
		By MONITORS_FIELD = By.xpath("//a[contains (text(), 'Monitors')]");
		By FOR_HOME_FIELD = By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[13]/ul/li[3]/a");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(PRODUCT_FIELD)).build().perform();
		action.moveToElement(driver.findElement(MONITORS_FIELD)).build().perform();
		driver.findElement(FOR_HOME_FIELD).click();
		
		
		
	}
	
}
