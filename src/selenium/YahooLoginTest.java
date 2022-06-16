package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.id("login-username"));
		email.sendKeys("dsdsadsadasd@hsacdsbc");
		
		WebElement login = driver.findElement(By.id("login-signin"));
		login.click();
		
		String expectedError = "Sorry, we don't recognize this account.";
		String actError = driver.findElement(By.className("error-msg")).getText();
		System.out.println(actError);
			
		if(expectedError.equals(actError))
		{
			System.out.println("Error Mached");
		}
		else
		{
			System.out.println("Not Macthed");
		}
	}

}
