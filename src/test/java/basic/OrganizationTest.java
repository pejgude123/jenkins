package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationTest {
	@Test
	public void organizationTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://locall.host/8888/");
		
	}
	

}
