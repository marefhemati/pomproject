package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpaths {
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get("https:https://www.techfios.com/billing/?ng=admin///www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void learnDifferentLacortors() {

		driver.findElement(By.cssSelector("input#username")).sendKeys("demo@techfios.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("abc123");
//Absolute Xpath 
		// driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
//Relative Xpath I used this formulla: //Tag[@Attribute Node=‘Value’]
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]")).click();
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Aref");
		driver.findElement(By.xpath("//select[@id='cid']")).click();
		driver.findElement(By.xpath("//option[@value='2']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aref.hemati@yahoo.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("5183344230");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("147 Winthrop Ave");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Albany");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("NY");
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("12203");
		driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']"))));
		driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']")).click();
		

	}

}
