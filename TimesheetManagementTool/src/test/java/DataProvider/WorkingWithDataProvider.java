package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {

	@DataProvider(name = "TestData")
	public Object[][] loginTestData() {
		Object[][] obj = new Object[5][2];

		obj[0][0] = "admin56342";
		obj[0][1] = "admin56342";

		obj[1][0] = "admin56342";
		obj[1][1] = "admin56342";

		obj[2][0] = "admin56342";
		obj[2][1] = "admin56342";

		obj[3][0] = "admin56342";
		obj[3][1] = "admin56342";

		obj[4][0] = "admin56342";
		obj[4][1] = "admin56342";

		return obj;

	}

	@Test(dataProvider = "TestData")
	public void loginIntoActiTime(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://jarvis-pc/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		driver.close();
	}

}
