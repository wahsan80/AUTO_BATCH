package Oct30_session;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Extra_Learning_testNG {
	
	public static WebDriver driver;

	@BeforeTest
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void SetUp() {
		driver.get("https://www.google.com/");
		System.out.println("The title of the page is: " + driver.getTitle());
	}
	/*
	@Test
	public void ClickOnSignInLink() {
		driver.findElement(By.name("signin"));
	}
	*/	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
}
