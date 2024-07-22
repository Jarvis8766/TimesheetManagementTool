package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndCustomerPage extends BaseClass {

	public ActiveProjectAndCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath = "//input[@value='Create New Customer']")
	private WebElement createNewCustomerButton;
	
	@FindBy (xpath = "//input[@value='Create New Project']")
	private WebElement createNewProjectButton;

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}

}
