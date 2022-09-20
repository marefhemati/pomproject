package variousCocepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstQuestion {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/109/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@Test
public void ValidateUserIsAbleToAddCategory() {
	driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("AC");
	driver.findElement(By.xpath("//*[@id=\"extra\"]/input[2]")).click();
	
	Assert.assertTrue("AC".contains("The category you want to add already exists: AC."));
}
}

