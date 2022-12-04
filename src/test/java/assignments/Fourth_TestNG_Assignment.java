package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fourth_TestNG_Assignment {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.t20worldcup.com/");
	}
	
	@Test(priority=1)
	
	public void ConfirmBrowser() {
		
		System.out.println("Title of the web page is: " + driver.getTitle());
	}
	
	@Test(priority=2)
	
	public void MatchSchedule() {
		
		driver.findElement(By.xpath("//a[contains(text(), 'Standings')]")).click();
		System.out.println("Title of the web page is: " + driver.getTitle());
	}
	
	@Test(priority=3)
	
	public void GoToHomePage() {
		
		driver.findElement(By.xpath("//a[contains(text(), 'Men’s T20 World Cup 2022')]")).click();
		System.out.println("Title of the web page is: " + driver.getTitle());
	}
	
	@Test(priority=4)
	
	public void ICCRankings() {
		
		driver.findElement(By.xpath("//a[contains(text(), 'ICC RANKINGS')]")).click();
		System.out.println("Title of the web page is: " + driver.getTitle());
	}
	
	@Test(priority=5)
	
	public void Login() {
		
		driver.findElement(By.className("sso-nav__login")).click();
		System.out.println("Title of the web page is: " + driver.getTitle());
	}

	@AfterTest
	
	public void Quit() {
		
		System.out.println("Quiting the program.");
		//driver.quit();
	}
	

}
