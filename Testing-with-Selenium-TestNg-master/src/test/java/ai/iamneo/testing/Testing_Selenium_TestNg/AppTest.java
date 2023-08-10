package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception {
		driver = new RemoteWebDriver(new URL("http://localhost:8080"), chromeOptions);
		driver.manage().window().maximize();
	}

	@Test
	public void TestCase_1() throws InterruptedException {
		driver.get("http://iamneo.ai");
		Thread.sleep(2000);  
		String title = driver.getTitle();
		Assert.assertEquals(title, "We are Hiring!");
	}
	@Test
	public void TestCase_2() throws InterruptedException {
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
	}
	@Test
	public void TestCase_3() throws InterruptedException {
		System.out.println(driver.getCurrentUrl());
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
