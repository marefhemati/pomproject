package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ToggleAllPage;
import util.BrowserFactory;

public class ValidateRemoveTest {
	
	WebDriver driver;
	@Test
	public void ValidateChecked() {
		 driver = BrowserFactory.init();
		 ToggleAllPage toggleAllPage = PageFactory.initElements(driver, ToggleAllPage.class);
		 toggleAllPage.clickToggleAll();	
		 toggleAllPage.ValidateAllListItemCouldBeRemoved();
		 
	}
}


