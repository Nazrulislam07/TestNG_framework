package toolsQA;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First {

	@Test
	public void Nazrul() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https:/toolsqa.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("DEMO SITES")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='primary-menu']/li[8]/ul/li[2]/a/span/span")).click();
		Thread.sleep(2000);	
				
	}
	
}


