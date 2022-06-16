package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//WebElement link = driver.findElement(By.linkText("also visit"));
		WebElement link = driver.findElement(By.name("reebok"));
		link.click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());

		Iterator<String> iter = allwindows.iterator();
		String parentWindow = iter.next();
		String childWindow = iter.next();// Read the handles
		
		System.out.println(parentWindow);// Print the random numbers for windows like session id
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());//Title for the Rebook page
		driver.close();// Close only current window or tab for selenium tab and windows same
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());// Title for the Adidas page
		driver.quit();// Close all the tabs and we cannot use driver after calling quit.
		
	}

}
