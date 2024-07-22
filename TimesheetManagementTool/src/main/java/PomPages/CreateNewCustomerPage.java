package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateNewCustomerPage extends BaseClass {

	public CreateNewCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@name='name']")
	private WebElement customerNameTextField;

	@FindBy(name = "createCustomerSubmit")
	private WebElement createCustomerButton;

	@FindBy(name = "customerId")
	private WebElement customerDropdown;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement projectNameTextField;

	@FindBy(name = "createProjectSubmit")
	private WebElement createProjectButton;

	public WebElement getCustomerNameTextField() {
		return customerNameTextField;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	public WebElement getProjectNameTextField() {
		return projectNameTextField;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}

	public void createNewCustomerAndProject(WebDriver driver, String customerName, String projectName) {
		ActiveProjectAndCustomerPage apacp = new ActiveProjectAndCustomerPage(driver);
		apacp.getCreateNewCustomerButton().click();
		customerNameTextField.sendKeys(customerName);
		createCustomerButton.click();
		apacp.getCreateNewProjectButton().click();
		Select s = new Select(customerDropdown);
		s.selectByVisibleText(customerName);
		projectNameTextField.sendKeys(projectName);
		createProjectButton.click();
	}
}
