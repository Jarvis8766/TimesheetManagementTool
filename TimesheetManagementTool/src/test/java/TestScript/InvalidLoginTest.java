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
public class InvalidLoginTest extends BaseTest {
	
	@Test(groups = "FT")
	public void invalidLogin() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		int rowCount = lib.getRowCount(EXCELPATH, INVALIDSHEET);
		
		for (int i = 0; i<rowCount; i++) {
			String username = lib.getDataFromExcelFile(EXCELPATH, INVALIDSHEET, i, 0);
			String password = lib.getDataFromExcelFile(EXCELPATH, INVALIDSHEET, i ,1);
			LoginPage lp = new LoginPage(driver);
			lp.invalidLogin(username, password);
			
			
		}
	}
}
