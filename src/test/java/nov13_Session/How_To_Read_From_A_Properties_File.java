package nov13_Session;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_To_Read_From_A_Properties_File {
	
	public static Properties prop;
	public static FileInputStream ip;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception{
		
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\nov13_Session\\config.properties";
		System.out.println(System.getProperty("user.dir"));
		
		prop = new Properties();
		ip = new FileInputStream(path);
		prop.load(ip);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("usernameXpath"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("passwordXpath"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("signinButtonXpath"));
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("usernameXpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("passwordXpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("signinButtonXpath"))).click();
	}

}
