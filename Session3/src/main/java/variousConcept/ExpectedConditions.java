package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpectedConditions {

	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		//DataType aname = value;
		
		//Storing data with WebElement
//		WebElement UserNameElement = driver.findElement(By.xpath("//*[@id=\"username\"]"));
//		WebElement passwordElement = driver.findElement(By.xpath("//*[@id=\"password\"]"));
//		WebElement signInElement = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
//WebElement ways to add values
//		UserNameElement.clear(); // Here before add userName we clear it, there maybe another username existed, it the benefits of WebElement
//		UserNameElement.sendKeys("demo@techfios.com");
//		passwordElement.sendKeys("abc123");
//		signInElement.click();
		
		//Storing Data with By class
		By USER_NAME_ELEMENT = By.xpath("//*[@id=\"username\"]");
		By PASSWOR_ELEMENT = By.xpath("//*[@id=\"password\"]");
		By sign_IN_ELEMENT = By.xpath("/html/body/div/div/div/form/div[3]/button");
		
//By class adding value
		driver.findElement(USER_NAME_ELEMENT).sendKeys("demo@techfios.com");
		driver.findElement(PASSWOR_ELEMENT).sendKeys("abc123");
		driver.findElement(sign_IN_ELEMENT).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[2]/a/span")).click();
		
		

		
		

	}
}
