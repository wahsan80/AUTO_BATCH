package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validate_FB_Create_New_Account {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE); //None/Eager determines the speed.
		options.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.facebook.com"); //Website to be automated.
		
		String ActualCurrentUrl = "https://www.facebook.com";
		String ExpectedCurrentUrl = driver.getCurrentUrl();
		
		String ActualTitle = "Facebook - log in or sign up";
		String ExpectedTitle = driver.getTitle();
		
		if(ActualCurrentUrl.equals(ExpectedCurrentUrl)){
			System.out.println("My url is correct");
		}else {
			System.out.println("My url is not correct");
		}
		
		if(ActualTitle.equals(ExpectedTitle)){
			System.out.println("My title is correct");
		}else {
			System.out.println("My title is not correct");
		}
		
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
		System.out.println("Create New Account");
		
		driver.findElement(By.xpath("//div[@class = '_5dbb']/child::input[1]")).sendKeys("Waqas");
		System.out.println("First Name");
		
		driver.findElement(By.xpath("//div[@class = '_5dbb']/child::div[1]/child::input[1]")).sendKeys("Ahsan");
		System.out.println("Last Name");
		
		//driver.findElement(By.xpath("//div[@id = 'u_k_f_n1']/child::div[1]/input")).sendKeys("w_ahsan@hotmail.com");
		//System.out.println("Email");
		
		
		System.out.println("End.");

	}

}
