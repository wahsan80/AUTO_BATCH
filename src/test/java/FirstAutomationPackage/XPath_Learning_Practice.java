package FirstAutomationPackage;

public class XPath_Learning_Practice {

	public static void main(String[] args) {
		
		System.out.println("Rediffmail:");
		System.out.println("//a[@class = 'mailicon']");
		System.out.println("//a[text() = 'Rediffmail']");
		System.out.println("//a[contains(text(), 'Rediffmail')]");
		System.out.println("Money:");
		System.out.println("//a[@class = 'moneyicon relative']");
		System.out.println("//a[@title = 'Live commentary of the Indian stock markets, stock quotes and business news']");
		System.out.println("//a[contains(@class, 'moneyicon relative')]");
		System.out.println("Business Email:");
		System.out.println("//a[@class = 'bmailicon relative']");
		System.out.println("//a[@title = 'Lightning fast business email hosting']");
		System.out.println("//a[contains(@title, 'Lightning fast business email hosting')]");
		System.out.println("Videos:");
		System.out.println("//a[@class = 'vdicon']");
		System.out.println("//a[@title = 'Watch videos']");
		System.out.println("//a[contains(@title, 'Watch videos')]");
		System.out.println("Shopping:");
		System.out.println("//a[@class = 'shopicon relative']");
		System.out.println("//a[@title = 'Online Shopping']");
		System.out.println("//a[contains(@title, 'Online Shopping')]");
		System.out.println("Sign In:");
		System.out.println("//a[@class = 'signin']");
		System.out.println("//a[@title = 'Already a user? Sign in']");
		System.out.println("//a[contains(@title, 'Already a user? Sign in')]");
		System.out.println("Create Account:");
		System.out.println("//a[@title = 'Create Rediffmail Account']");
		System.out.println("//a[contains(@title, 'Create Rediffmail Account')]");
		System.out.println("User Name:");
		System.out.println("//input[@id = 'login1']");
		System.out.println("//input[@name = 'login']");
		System.out.println("//input[contains(@id, 'login1')]");
		System.out.println("Password:");
		System.out.println("//input[@id = 'password']");
		System.out.println("//input[@name = 'passwd']");
		System.out.println("//input[contains(@id, 'password')]");
		System.out.println("Sign In:");
		System.out.println("//input[@class = 'signinbtn']");
		System.out.println("//input[@name = 'proceed']");
		System.out.println("//input[contains(@class, 'signinbtn')]");
		
	}

}
