package toolsQA;




import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot {
	@Test
	public void getScreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https:/toolsqa.com/");

		TakesScreenshot TS= (TakesScreenshot)driver;
	    File Source= TS.getScreenshotAs(OutputType.FILE);
	    Files.copy(Source, new File("G:/Screenshots/tq.png"));
	    
	    //Files.copy(Source, new File("./Screenshots/tq.png"));
		
	System.out.println("Screenshot taken");
	
	
	}

}