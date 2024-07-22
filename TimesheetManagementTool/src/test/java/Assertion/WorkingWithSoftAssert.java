package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://jarvis-pc/login.do");

		SoftAssert s = new SoftAssert();
		s.assertEquals(driver.getTitle(), "actiTIME - Login");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("actTime@1");
		driver.findElement(By.id("loginButton")).click();
		
		s.assertAll();

//		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}
}
