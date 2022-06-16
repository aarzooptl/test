package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("helljdcjsbcndso");
		WebElement password = driver.findElement(By.cssSelector("#pass"));
		password.sendKeys("");
		WebElement login = driver.findElement(By.cssSelector("button[name='login']"));
		login.click();
	}

}
