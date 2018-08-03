package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fourth {


	@Test
	public void Facebook() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https:/toolsqa.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/tools.qa");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Nazrul Islam");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
	}
}