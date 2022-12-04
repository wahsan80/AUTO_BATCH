package Oct30_session;

import org.testng.annotations.*;

public class Learning_TestNG {

	//Selenium is Test Suite
	//TestNG - is an execution engine, is also a reporting system, also helps in parallel execution.
	//Also helps in batch running of files. Helps in group running. customizes your test cases and it's 
	//execution process.
		
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Testing @BeforeSuite annotation");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Testing @BeforeTest annotation");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Testing @BeforeClass annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Testing @BeforeMethod annotation");
	}
}
