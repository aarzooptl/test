package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("jsdhjssfnsffnf");
		
		WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		next.click();
		
		String actualError = "Couldn’t find your Google Account";
		String expectedError = driver.findElement(By.className("o6cuMc")).getText();
		System.out.println(expectedError);
		
		if(actualError.equals(expectedError))
		{
			System.out.println("ERROR MATCHED");
		}
		else
		{
			System.out.println("NOT MATCHED");
		}
		
	}

}
