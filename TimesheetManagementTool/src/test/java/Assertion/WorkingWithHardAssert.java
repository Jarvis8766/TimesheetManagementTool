package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WorkingWithHardAssert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://jarvis-pc/login.do");

		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
//		Assert.assertEquals(driver.getTitle(), "actiTIME - Lo");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("actTime@1");
		driver.findElement(By.id("loginButton")).click();

		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}
}
