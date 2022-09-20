package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFileUpload {

	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void learnDifferentLacortors() {
//we use sendkey methods to upload as long as the tag is input
//any other tag you'll have to use Robot Class (in interview I use it long time ago) 
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\arefh\\OneDrive\\Desktop\\New Microsoft Word Document (2).doc");
	
	}
}
