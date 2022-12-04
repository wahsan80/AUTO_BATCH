package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Third_TestNG_Program {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void LaunchBroweser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
	}
	
	@Test(priority=1)
	
	public void ConfirmBrowser() {
		
		System.out.println("Title of the web page is: " + driver.getTitle());
	}
	
	@Test(priority=2)
	
	public void SearchMobile() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("Title of the web page is: " + driver.getTitle());
	}
	
	@Test(priority=3)
	
	public void GoToHomePage() {
		
		driver.findElement(By.id("nav-logo-sprites")).click();
		System.out.println("Title of the web page is: " + driver.getTitle());
	}
	
	@Test(priority=4)
	
	public void EnterCart() {
		
		driver.findElement(By.id("nav-cart-count")).click();
		System.out.println("Title of the web page is: " + driver.getTitle());		
	}
	
	@Test(priority=5)
	
	public void SignIntoAccount() {
		
		driver.findElement(By.className("a-size-base-plus")).click();
		System.out.println("Title of the web page is: " + driver.getTitle());
	}
	
	@AfterTest
	
	public void Quit() {
		
		System.out.println("Quiting the program.");
		driver.quit();
	}

}
