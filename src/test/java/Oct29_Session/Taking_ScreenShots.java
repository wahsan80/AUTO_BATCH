package Oct29_Session;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taking_ScreenShots {
	
	private static final WindowType WindowType = null;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.com");
		
		WebElement owmScreen = driver.findElement(By.cssSelector("div.section.where-to")); //Pick own xpath
		File source = owmScreen.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("C:\\Users\\w_ahs\\eclipse-workspace\\AUTOMATION_BATCH\\ScreenShots\\ScreenShot1.png"));
		FileHandler.copy(source, destination);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("http://shaadi.com");
		
		WebElement shaadiBanner = driver.findElement(By.cssSelector("div.css-83u8gt"));
		File source1 = shaadiBanner.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(System.getProperty("user.dir") + "C:\\Users\\w_ahs\\eclipse-workspace\\AUTOMATION_BATCH\\ScreenShots\\ScreenShot2.png");
		
		FileHandler.copy(source1, destination1);
		
		//https://github.com/seleniumpandaofficial/AutomationBatch
		
	}

}
