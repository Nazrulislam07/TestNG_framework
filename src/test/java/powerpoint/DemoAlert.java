package powerpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAlert {

	@Test
	public void handleAlert() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 


		driver.manage().window().maximize();

		driver.get("http://www.ksrtc.in/oprs-web/");

		Thread.sleep(2000);
		driver.findElement(By.id("searchBtn")).click();

		Thread.sleep(1000);

		System.out.println(driver.switchTo().alert().getText());

		//or

		/*String text=driver.switchTo().alert().getText();
		System.out.println(text);*/

		driver.switchTo().alert().accept();

		//driver.switchTo().alert().dismiss();
		/* sometimes you can see in alert two button one of the is ok
		and oter one is cancel. so if you wanna select cancel then you have to 
		use dismiss */




	}



}
