package FirstAutomationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Validating_URL_Practice {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
		// https://github.com/seleniumpandaofficial/AutomationBatch
		// To clone Kumar Code
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-939301761%3A1666507149917836&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWpNUwLX4bvZaczUVchjc-njg7c_e7AKgY_hofCU_CI2hBzYEuWd_BYAs4-e8offu1NiykUeHQ");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://accounts.google.com/v3/signin/identifier?dsh=S-939301761%3A1666507149917836&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWpNUwLX4bvZaczUVchjc-njg7c_e7AKgY_hofCU_CI2hBzYEuWd_BYAs4-e8offu1NiykUeHQ";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Sign in - Google Accounts";
		String expectedTitle = driver.getTitle();
		
		if (actualCurrentUrl.equals(expectedCurrentUrl) && actualTitle.equals(expectedTitle)) {
			
			System.out.println("My First Url is Correct.");
		} else {		
			System.out.println("My First Url is not correct.");
			}
		
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1666507545&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3dd85e4cc4-cad5-f8d7-e83a-e231233d2d6a&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl2 = "https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1666507545&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3dd85e4cc4-cad5-f8d7-e83a-e231233d2d6a&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015";
		String expectedCurrentUrl2 = driver.getCurrentUrl();
		String actualTitle2 = "Sign in to your Microsoft account";
		String expectedTitle2 = driver.getTitle();
		
		if (actualCurrentUrl2.equals(expectedCurrentUrl2) && actualTitle2.equals(expectedTitle2)) {
			
			System.out.println("My 2nd Url is Correct.");
		} else {		
			System.out.println("My 2nd Url is not correct.");
			}
		
		driver.get("https://login.yahoo.com/?.lang=en-CA&.intl=ca&src=homepage&.done=https%3A%2F%2Fca.yahoo.com%2F%3Fp%3Dus%26guccounter%3D1&pspid=2142623533&activity=ybar-signin");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl3 = "https://login.yahoo.com/?.lang=en-CA&.intl=ca&src=homepage&.done=https%3A%2F%2Fca.yahoo.com%2F%3Fp%3Dus%26guccounter%3D1&pspid=2142623533&activity=ybar-signin";
		String expectedCurrentUrl3 = driver.getCurrentUrl();
		String actualTitle3 = "Yahoo";
		String expectedTitle3 = driver.getTitle();
		
		if (actualCurrentUrl3.equals(expectedCurrentUrl3) && actualTitle3.equals(expectedTitle3)) {
			
			System.out.println("My 3rd Url is Correct.");
		} else {		
			System.out.println("My 3rd Url is not correct.");
			}
		
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tLP1TcwMqs0MrMwYPTiLTEyUCjPL8pJUUguLQAAYHoHnw&q=t20+world+cup&rlz=1C1CHBD_enCA1021CA1021&oq=t20&aqs=chrome.1.69i57j46i131i433i512j0i131i433i512l4j0i512j69i60.3165j0j7&sourceid=chrome&ie=UTF-8#sie=m;/g/11pvcdfc8x;5;/m/026y268;dt;fp;1;;;");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl4 = "https://www.google.com/search?gs_ssp=eJzj4tLP1TcwMqs0MrMwYPTiLTEyUCjPL8pJUUguLQAAYHoHnw&q=t20+world+cup&rlz=1C1CHBD_enCA1021CA1021&oq=t20&aqs=chrome.1.69i57j46i131i433i512j0i131i433i512l4j0i512j69i60.3165j0j7&sourceid=chrome&ie=UTF-8#sie=m;/g/11pvcdfc8x;5;/m/026y268;dt;fp;1;;;";
		String expectedCurrentUrl4 = driver.getCurrentUrl();
		String actualTitle4 = "t20 world cup - Google Search";
		String expectedTitle4 = driver.getTitle();
		
		if (actualCurrentUrl4.equals(expectedCurrentUrl4) && actualTitle4.equals(expectedTitle4)) {
			
			System.out.println("My 4th Url is Correct.");
		} else {		
			System.out.println("My 4th Url is not correct.");
			}
		
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl5 = "https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
		String expectedCurrentUrl5 = driver.getCurrentUrl();
		String actualTitle5 = "Amazon Sign-In";
		String expectedTitle5 = driver.getTitle();
		
		if (actualCurrentUrl5.equals(expectedCurrentUrl5) && actualTitle5.equals(expectedTitle5)) {
			
			System.out.println("My 5th Url is Correct.");
		} else {		
			System.out.println("My 5th Url is not correct.");
			}
		
	} //End of main()

}// End of class 
