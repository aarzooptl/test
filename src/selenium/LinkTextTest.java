package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		//Classname objname = new Classname();
		FirefoxDriver driver = new FirefoxDriver();//open browser
		driver.get("https://www.google.com/");//open google
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("About")).click();
		
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.titleContains("Google"));
		
		//Title
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		//URL
		String expectedUrl = "https://about.google/";
		System.out.println(expectedUrl);
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		
		//check both title and Url
		if(expectedTitle.equals(actualTitle) && actualUrl.contains(expectedUrl))
		{
			System.out.println("Pass");
		}	
		else
		{
			System.out.println("Fail");
			
		}

	}

}
