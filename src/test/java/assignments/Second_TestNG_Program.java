package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second_TestNG_Program {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = 1)
	
	public void ConfirmBrowser() {
		
		System.out.println("Title of the web page is: " + driver.getTitle());
	}
	
	@Test(priority = 2)
	
	public void ClickSignInButton() {
		
		driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();
		System.out.println("Title of the Sign in page is: " + driver.getTitle());
	}
	
	@Test(priority = 3)
	
	public void CreateAccount() {
		
		driver.findElement(By.xpath("//span[contains(text(), 'Create account')]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'For my personal use')]")).click();
		System.out.println("Title of the Create Account page 0 is: " + driver.getTitle());
	}
	
	@Test (priority = 4)
	
	public void EnterFirstLastName() {
		
		driver.findElement(By.id("firstName")).sendKeys("Waqas");
		driver.findElement(By.id("lastName")).sendKeys("Ahsan");
		System.out.println("Title of the Create Account page 1 is: " + driver.getTitle());
	}
	
	@Test(priority = 5)
	
	public void EnterUsernamePassword() {
		
		driver.findElement(By.id("username")).sendKeys("SeleniumAutoTesting");
		driver.findElement(By.name("Passwd")).sendKeys("Selenium2022!");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Selenium2022!");
		System.out.println("Title of the Create Account page 2 is: " + driver.getTitle());
	}
	
	@AfterTest
	
	public void Quit() {
		
		System.out.println("Quit the program.");
		driver.quit();
	}

}
