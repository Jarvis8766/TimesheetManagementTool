package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUserPage extends BaseClass {

	public CreateNewUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement createUserNameTextField;
	
	@FindBy(name = "passwordText")
	private WebElement createPasswordTextField;
	
	@FindBy(name = "passwordTextRetype")
	private WebElement passwordTextRetypeField;
	
	@FindBy(name = "firstName")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastName")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[contains(@value, 'Create User')]")
	private WebElement createUserButton;

	public WebElement getCreateUserNameTextField() {
		return createUserNameTextField;
	}

	public WebElement getCreatePasswordTextField() {
		return createPasswordTextField;
	}

	public WebElement getPasswordTextRetypeField() {
		return passwordTextRetypeField;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	
	public void createNewUser(String username, String password, String fn, String Ln) {
		createUserNameTextField.sendKeys(username);
		createPasswordTextField.sendKeys(password);
		passwordTextRetypeField.sendKeys(password);
		firstNameTextField.sendKeys(fn);
		lastNameTextField.sendKeys(Ln);
		createUserButton.click();
	}
	
	
}
