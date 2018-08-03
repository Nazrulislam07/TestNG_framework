package fb_book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FB_Login {
	@Parameters({"URL"})
	@Test
	public void sign(String urlname) throws InterruptedException{

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(urlname);
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("nazrulislam");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(1000);
		System.out.println("Succsessfully logged in");


		//	driver.findElement(By.linkText("Forgot account?")).click();


		//	System.out.println(driver.findElement(By.xpath("//*[@id='identify_yourself_flow']/div/div[2]/div/table/tbody/tr[1]/td[2]/div")).getText());

		Thread.sleep(6000);

		driver.close();


	}

}
