package variousCocepts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
	
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() throws InterruptedException {
//		System.out.println(driver.getTitle());//Here when we get the title before search it give us the first window title
//		String handle1 = driver.getWindowHandle();
//		System.out.println(handle1);
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("xpath");
		driver.findElement(By.xpath("//input[@id='ybar-search']")).click();

//		System.out.println(driver.getTitle()); //here afte clicking it still give us first the first window title
		//Therfore we use the window handle and window handle has this method: String handle = driver.getWindowHandle() and it
		// return a handle of the current page/tab
		String handle2 = driver.getWindowHandle();
		System.out.println(handle2);
		driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[1]/h3/a")).click();
		Set<String> handles = driver.getWindowHandles();
		for(String str : handles) {
			driver.switchTo().window(str);
		}
}
}