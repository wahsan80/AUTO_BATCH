package nov06_Session;

import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selectors {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void LaunchBrowser(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
	}
	
	@Test(priority=1)
	
	public void SignIn() {
		
		System.out.println("Before Click");
		driver.findElement(By.cssSelector("a.signin")).click();
		System.out.println("After Click");
	}
	
	@AfterTest
	
	public void Quit() {
		
		//driver.quit();
	}

}
