package FirstAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_Learning {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com");
		
		driver.findElement(By.xpath("//a[@class = 'login']")).click();
		driver.findElement(By.xpath("//input[@id = 'email_create']")).sendKeys("w_ahsan@hotmail.com");
		driver.findElement(By.xpath("//button[@id = 'SubmitCreate']")).click();
		driver.findElement(By.xpath("//input[@id = 'id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id = 'customer_firstname']")).sendKeys("Waqas");
		driver.findElement(By.xpath("//input[@id = 'customer_lastname']")).sendKeys("Ahsan");
		
		
		

	}

}
