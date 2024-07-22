package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PomPages.CreateNewUserPage;
import PomPages.HomePage;
import PomPages.LoginPage;
import PomPages.UserListPage;
import genericLib.BaseTest;
import genericLib.Flib;
import genericLib.WorkLib;

public class CreateUserTest extends BaseTest {
	
	@Test(groups = "RT")
	public void createNewUser() throws EncryptedDocumentException, IOException {
		
		//login
		Flib f = new Flib();
		String username = f.getDataFromExcelFile(EXCELPATH, USERSHEET, 1, 0);
		String password = f.getDataFromExcelFile(EXCELPATH, USERSHEET, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
		
		//click on user link
		HomePage hp = new HomePage(driver);
		hp.clickOnUsersLink();
		
		//click on createNewUserButton
		UserListPage ulp = new UserListPage(driver);
		ulp.clickOnCreateNewUserButton();
		
		WorkLib wlib = new WorkLib(); 
		
		String usn = f.getDataFromExcelFile(EXCELPATH, NEWUSERSHEET, 1, 0) + wlib.getRandom();
		String pwd = f.getDataFromExcelFile(EXCELPATH, NEWUSERSHEET, 1, 1) + wlib.getRandom();
		String fn = f.getDataFromExcelFile(EXCELPATH, NEWUSERSHEET, 1, 2) + wlib.getRandom();
		String ln = f.getDataFromExcelFile(EXCELPATH, NEWUSERSHEET, 1, 3) + wlib.getRandom();
		
		//create new user
		CreateNewUserPage cnup = new CreateNewUserPage(driver);
		cnup.createNewUser(usn, pwd, fn, ln);
		
	}

}
