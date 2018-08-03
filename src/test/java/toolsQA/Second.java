package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Second {


	@Test
	public void Dobon() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https:/toolsqa.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("DEMO SITES")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='primary-menu']/li[8]/ul/li[2]/a/span/span")).click();
		Thread.sleep(1000);		

	}

	@Test
	public void Islam() throws Throwable
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://demoqa.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='menu-item-374']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name_3_firstname")).sendKeys("Md Nazrul");
		Thread.sleep(1000);
		driver.findElement(By.id("name_3_lastname")).sendKeys("Islam");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@value='married']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id='pie_register']/li[3]/div/div[1]/input[3]")).click();
		Thread.sleep(1000);

		Select sr = new Select(driver.findElement(By.id("dropdown_7")));
		sr.selectByValue("United States");
		Thread.sleep(1000);

		Select s = new Select(driver.findElement(By.id("mm_date_8")));
		s.selectByValue("12");
		Thread.sleep(1000);

		Select m = new Select(driver.findElement(By.id("dd_date_8")));
		m.selectByValue("8");
		Thread.sleep(1000);

		Select p = new Select(driver.findElement(By.id("yy_date_8")));
		p.selectByValue("1987");
		Thread.sleep(1000);

		driver.findElement(By.id("phone_9")).sendKeys("+1 339 221 1782");
		Thread.sleep(1000);

		driver.findElement(By.id("username")).sendKeys("Nazrul Islam");
		Thread.sleep(1000);

		driver.findElement(By.id("email_1")).sendKeys("dobon.islam@gamil.com");
		Thread.sleep(1000);

		driver.findElement(By.id("description")).sendKeys("My name is Nazrul. I live in Boston, I'm from Bangladesh. I have been live United States four year. I'm learning software automation engineering program.");
		Thread.sleep(1000);

		driver.findElement(By.id("password_2")).sendKeys("Bangladesh1971");
		Thread.sleep(1000);

		driver.findElement(By.id("confirm_password_password_2")).sendKeys("Bangladesh1971");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		Thread.sleep(1000);
	}

	@Test
	public void Md()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://toolsqa.com/selenium-training/");
		driver.manage().window().maximize();
	}
}