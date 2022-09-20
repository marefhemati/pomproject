package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void learnDifferentLacortors() {
//Link Text locator is the one when we click on link and open new tap for us, when we inspect we use text instead of link. like below.
		//driver.findElement(By.linkText("Charity supporting the Ukrainian army")).click();
//Partial Link Text we use the partial of text it should be unique like below the text was (Ukraine Crisis Fund) we only to (Crisis Fund)
		driver.findElement(By.partialLinkText("Crisis Fund")).click();
	}
}
