package FirstAutomationPackage;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Validating_Web_Elements {
	
	//Validate Web Elements
	//isDisplayed()
	//isEnabled()
	//isSelected
	
	//Open any regular browser and then - Ctrl+Shift+N. It will open incognito mode
	
	//1. id
	//2. className
	//3. name
	//4. xpath
	//5. cssSelector
	//6. tagname
	//7. linkText
	//8. partiallinkText
	// ============ 99% above utility.
	//9. ByAll
	//10. ByIdOrName
	//11. ByChained
	// ============ 1% above utility.
	//12. above
	//13. below
	//14. near
	//15. toRightOf
	//16. toLeftOf
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE); //None/Eager determines the speed.
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		

	}

}
