package maventestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTestClass
{
	
	@Test
	public void test() 
	{
		WebDriver driver = new ChromeDriver();
		
		driver .get("https://google.com");
		
		
		
	}

}
