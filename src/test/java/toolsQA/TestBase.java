package toolsQA;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase {

	public WebDriver driver=null;
	
	@Test
	public void Login() throws IOException
	{
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\NABILA\\workspace\\TestNG_01\\src\\test\\java\\toolsQA\\datadriven.properties");
		prop.load(fis);

		System.out.println(prop.getProperty("username"));


		if(prop.getProperty("browser").equals("firefox"))
		{
		 driver = new FirefoxDriver();

		}
		else if(prop.getProperty("browser").equals("chrome"))
		{
		 driver = new ChromeDriver();	
		}
		else 
		{
		 driver = new InternetExplorerDriver();	
		}
		driver.get(prop.getProperty("url"));
	}
}
