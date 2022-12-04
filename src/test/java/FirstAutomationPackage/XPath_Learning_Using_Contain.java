package FirstAutomationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_Learning_Using_Contain {
	
	public static WebDriver driver; // Ctrl+Shift+o

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup(); // Ctrl+Shift+o
		driver = new ChromeDriver(); // Ctrl+Shift+o
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://rediff.com");
		driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@class, 'signinbtn')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'rd_logout')]")).click();
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
		
		// Understanding Xpath locator options
		// 1. //html[@attribute = 'ValueOfTheAttribute'] (Format)
		//    //a[@class = 'login'] (Example)
		
		// 2.1 //html[@attribute1 = 'Value' and @attribute2 = 'Value'] (Format)
		//     //input[@id = 'email_create' and @name = 'email_create'] (Example)
		
		// 2.2 //html[@attribute1 = 'Value' or @attribute2 = 'Value'] (Format)
		//     //input[@id = 'email_create' or @name = 'email_create'] (Example)
		
		//3. Using Text
		//html[text() = 'TextContent'] (Format)
		
		// 4. Using Contains
		// //html[contains(text(), 'textcontent')] (Format)
		// //a[contains(text(), 'Sign In')] (Example)
		
		// 5. Using Contains
		// //html[contains(@attribute, 'Value')] (Format)
		// //a[contains(@class, 'login')]
		
		

	}

}
