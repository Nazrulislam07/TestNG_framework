package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Third {


	@Test
	public void Training() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https:/toolsqa.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("TRAININGS")).click();
		driver.close();
	}

	@Test
	public void About() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https:/toolsqa.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("ABOUT")).click();
		Thread.sleep(2000);
	}	
}