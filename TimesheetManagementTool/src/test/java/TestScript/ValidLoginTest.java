package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomPages.LoginPage;
import genericLib.BaseTest;
import genericLib.CustomerListener;
import genericLib.Flib;

@Listeners(CustomerListener.class)
public class ValidLoginTest extends BaseTest {

	@Test(groups = "ST", description = "Verify the user is able to login inside the application or not")
	public void login() throws EncryptedDocumentException, IOException {
		Flib f = new Flib();
		String username = f.getDataFromExcelFile(EXCELPATH, USERSHEET, 1, 0);
		String password = f.getDataFromExcelFile(EXCELPATH, USERSHEET, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
	}

}
