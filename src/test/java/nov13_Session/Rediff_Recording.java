package nov13_Session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Recording {
	
	public static WebDriver driver;
	
	@Test(invocationCount=2)
	
	public static void test() throws Exception{
		
		ScreenRecorderUtil.startRecord("test");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("selenium@123");
		driver.findElement(By.xpath("//input[contains(@class, 'signinbtn')]")).click();
		driver.quit();
		
		ScreenRecorderUtil.stopRecord();
		
	}

}
