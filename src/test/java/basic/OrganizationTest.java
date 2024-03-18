package basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class OrganizationTest {
	@Test
	public void organizationTest()
	{
		
		

		
			
		WebDriver driver = new ChromeDriver();	
		//To maximize the window
		//wutil.maximize(driver);
		//To apply wait for findelement()
		//wutil.implicitwait(driver);
		driver.get("https://locall.host/8888/");
		
		//To read data from Property File
		//String URL = putil.getDataFromPropertyFile("Url");
		//String USERNAME =putil.getDataFromPropertyFile("Username");
		//String PASSWORD = putil.getDataFromPropertyFile("Password");
		
		
		//To launch the application
	
		
		
		// Login to application 
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
	}
	

}
