package variousCocepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

//Elements list, we made them global to be able to call it in each method that we need
	By USER_NAME_FIELD = By.xpath("//input[@id='username']");
	By PASSWORD_FIELD = By.xpath("//input[@id='password']");
	By LOGIN_FIELD = By.xpath("//button[@name='login']");
	By DASHBOARD_FIELD = By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
	By CUSTOMERS_FIELD = By.xpath("//span[contains(text(),'Customers')]");
	By ADDCUSTOMERS_FIELD = By.xpath("//a[contains(text(),'Add Customer')]");
	By FULL_NAME_FIELD = By.xpath("account");
	By COMPANY_FIELD = By.xpath("//select[@id='cid']");
	By EMAIL_FIELD = By.xpath("//input[@id='email']");
	By PHONE_FIELD = By.xpath("//input[@id='phone']");
	By ADDRESS_FIELD = By.xpath("//input[@id='address']");
	By CITY_FIELD = By.xpath("//input[@id='city']");
	By STATE_FIELD = By.xpath("//input[@id='state']");
	By ZIP_OR_POSTAL_CODE_FIELD = By.xpath("//input[@id='zip']");
	By COUNTRY_FIELD = By.xpath("//select[@id='country']");

	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
//			System.setProperty("webdriver.gecko.driver", ".\\drivers\\chromedriver.exe");
//			driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test // Here we prioritize it if we have multiple @Test which one should be run firs
			// which one should be run 2nd like: @Test(priority =1)
	public void loginTest() {

		// Test Data
		String userName = "demo@techfios.com";
		String password = "abc123";

		driver.findElement(USER_NAME_FIELD).sendKeys(userName);
		driver.findElement(PASSWORD_FIELD).sendKeys(password);
		driver.findElement(LOGIN_FIELD).click();

		Assert.assertEquals(driver.findElement(DASHBOARD_FIELD).getText(), "Dashboard", "Wrong page");
	}

	@Test
	public void negativeLogin() {
		driver.findElement(USER_NAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc1234");
		driver.findElement(LOGIN_FIELD).click();
	}

	@Test
	public void addCustomers() {
		loginTest();

		driver.findElement(CUSTOMERS_FIELD).click();
		driver.findElement(ADDCUSTOMERS_FIELD).click();
		driver.findElement(FULL_NAME_FIELD).sendKeys("Aref Hemati");

		Select sel = new Select(driver.findElement(COMPANY_FIELD));
		sel.selectByVisibleText("Apple");

	}
@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
