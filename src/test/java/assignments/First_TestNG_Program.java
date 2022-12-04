package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_TestNG_Program {
	
	public static WebDriver driver;	
	
	@BeforeTest
	
	public void LaunchBrowser() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 1)
	public void ConfirmBrowser() {
		
		System.out.println("Title of the browser is: " + driver.getTitle());
	}
	
	@Test(priority = 2)
	
	public void ClickSignInButton() {
		
		driver.findElement(By.className("signin")).click();
		System.out.println("Title of the signin page is: " + driver.getTitle());
	}
	
	@Test(priority = 3)
	
	public void EnterUsernamePassword() {
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		System.out.println("Title of the signedin page is: " + driver.getTitle());
	}
	
	@Test(priority = 4)
	
	public void LogOut() {
		
		driver.findElement(By.className("rd_logout")).click();
		System.out.println("Title of the signedout page is: " + driver.getTitle());
	}
	
	@Test(priority = 5)
	
	public void GoToHomePage() {
		
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
		System.out.println("Title of the home page is: " + driver.getTitle());
	}
	
	@AfterTest
	
	public void ExitTesting() {
		
		System.out.println("Quiting the testing.");
		driver.quit();
	}

}
