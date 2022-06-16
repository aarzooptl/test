package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));//email
		email.sendKeys("sdsdssdssdfsdfdsfd");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("sdssdf");
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();

	}

}
