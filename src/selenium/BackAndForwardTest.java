package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("About")).click();
		wait.until(ExpectedConditions.titleContains("About"));
		System.out.println(driver.getTitle()); //About Page
		
		driver.navigate().back();
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println(driver.getTitle()); //Google Page
		
		driver.navigate().forward();
		wait.until(ExpectedConditions.titleContains("About"));
		System.out.println(driver.getTitle()); //About Page
	}

}
