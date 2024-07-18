package TestLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CogmentoTest {
	
	protected static WebDriver driver;
	
	@Test(priority=1)
	public void setup()
	{
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://ui.cogmento.com/");
	}
	

}
