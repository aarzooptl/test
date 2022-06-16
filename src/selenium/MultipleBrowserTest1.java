package selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class MultipleBrowserTest1 {

	public static void main(String[] args) {
		
       WebDriver driver; // At this point driver is null
		
		
       Xls_Reader d = new Xls_Reader("C:\\testing\\NikulTest.xlsx");
       String browser = d.getCellData("Data1", "Browser", 2);//SheetName, col-name, raw-number
       
		System.out.println(browser);
		if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else //if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		/*else
		{
			System.setProperty("webdriver.safari.driver", "C:\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver();
		}*/
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("jshds");
		driver.findElement(By.name("pass")).sendKeys("dsfsdf");
		driver.findElement(By.tagName("button")).click();

	}


}
