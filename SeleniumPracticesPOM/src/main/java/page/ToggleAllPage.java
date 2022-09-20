package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ToggleAllPage {

	WebDriver driver;

	public ToggleAllPage(WebDriver driver) {
		this.driver = driver;

	}

	// WebElement
	@FindBy(how = How.XPATH, using = "//input[@value='on']") WebElement toggle_All;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox' and contains(@name,'todo[3]')]") WebElement checkbox_selected;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox' and contains(@name,'todo[5]')]") WebElement  singlecheckBoxSelectd;
	@FindBy(how = How.XPATH, using = "//input[@value='on']") WebElement validateToggle_AllIsSelected;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']") WebElement removeValidation;

	public void clickToggleAll() {
		toggle_All.click();
		
	}

	public void validAllCheckboxIsChecked() {
		Assert.assertEquals(true, checkbox_selected.isSelected());
		
		
	}

	public void ValidateSingleListTtemCouldBeRemoved() {
		Assert.assertEquals(true, singlecheckBoxSelectd.isSelected());
		
	}
	
	public void ValidateAllListItemCouldBeRemoved() {
		Assert.assertEquals(removeValidation.isEnabled(), toggle_All.isSelected());
	}
	
}
