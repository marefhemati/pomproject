package variousConcept;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
//before we go to next we should validate it that should land on the right page. then we do it by Assert class, like below.

		By DASHBOARD_HEADER_FIELD = By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");

//		Assert.assertTrue("Wrong page", driver.findElement(DASHBOARD_HEADER_FIELD).isDisplayed()); //we used asserttrue.

		Assert.assertEquals("Not Dashboard page", "Dashboard", driver.findElement(DASHBOARD_HEADER_FIELD).getText()); // we
																														// used
																														// assertEquals

		driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]")).click();
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Mohammad Aref");

		By COMPANY_FIELD_DROPDOWN = By.xpath("//select[@id='cid']");

		Select sel = new Select(driver.findElement(COMPANY_FIELD_DROPDOWN));
		sel.selectByVisibleText("Uber");

		By COUNTRY_DROPDOWN_FIELD = By.xpath("//select[@id='country']");

		Select sel1 = new Select(driver.findElement(COUNTRY_DROPDOWN_FIELD));
		sel1.selectByVisibleText("Uganda");
		
//We can print the all the list like below by using for each loop.
		List<WebElement> Totall_Country_List = sel1.getOptions();
		
		for(WebElement e : Totall_Country_List) {
			System.out.println(e.getText());
			
		}
	}

}
