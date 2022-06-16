package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		//pop-close-btn
		List<WebElement> popup = driver.findElements(By.className("pop-close-btn"));
		System.out.println(popup.size());
		
		//If you get the popup close the popup and type computer in search box.
		if(popup.size()>0)
		{
			driver.findElement(By.className("pop-close-btn")).click();
		}
		    driver.findElement(By.id("search-key")).sendKeys("computer");

	}

}
