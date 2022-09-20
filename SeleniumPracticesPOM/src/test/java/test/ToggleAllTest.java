package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ToggleAllPage;
import util.BrowserFactory;

public class ToggleAllTest {
	
	WebDriver driver;
	@Test
	public void ValidateWhenTheToggleAllCheckBoxIsCHECKED_AllCheckBoxesAreAlsoCHECKED_ON() {
		 driver = BrowserFactory.init();
		 ToggleAllPage toggleAllPage = PageFactory.initElements(driver, ToggleAllPage.class);
		 toggleAllPage.clickToggleAll();
		 
		
		
	}

}
