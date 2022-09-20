package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Seletors {
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
	public void learnDifferentLacortors() {

		driver.findElement(By.cssSelector("input#username")).sendKeys("demo@techfios.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("abc123");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
