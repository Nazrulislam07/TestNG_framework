package powerpoint;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Handle_Multiple_Windows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/account/create");
		driver.findElement(By.xpath("//*[@class='privacyLink']")).click();
		System.out.println("Before switching");
		System.out.println(driver.getTitle());
		//Selenium get by default parent window title
		Set<String>allWindows=driver.getWindowHandles();
		Iterator<String>ite=allWindows.iterator();
		String pWindow=ite.next();
		String cWindow=ite.next();
		driver.switchTo().window(cWindow);
		System.out.println("After switching");
		driver.switchTo().window(pWindow);
		System.out.println("Switching back to parent");
		System.out.println(driver.getTitle());
		
	}

}
