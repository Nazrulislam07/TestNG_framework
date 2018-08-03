package powerpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//above line for how many frame you have in this link
		
		//driver.switchTo().frame(0);
		
		//or
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));		
		WebElement target= driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		/*You can handle frame by index,frame name and findElement. findElement is the 
		best way to handle frame because tomorrow developer can add more frame*/
		
		
	}

}
