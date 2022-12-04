package Oct29_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab_NewWindow {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.costco.com");
		
		openWindow();
		
		driver.quit();		
	}
	
	static void openWindow() {
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.cnn.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.bbc.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.foxnews.com");
		
		driver.quit();
		
	}
	
	

}
