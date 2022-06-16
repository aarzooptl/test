package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		Thread.sleep(4000);
		
		WebElement email = driver.findElement(By.id("login-email"));//email
		email.sendKeys("asgadsxsxcxcxccdxffa@fhgsdas.com");
		
		WebElement password = driver.findElement(By.id("login-password"));//
		password.sendKeys("sdsdssdssdfsdfdsfd");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));//
		login.click();
		Thread.sleep(3000);
		
		String expectedError = "Incorrect email/password – please check and retry";
		String acutalError = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(acutalError);
		 if(expectedError.equals(acutalError))
		 {
			 System.out.println("Error Matched");
		 }
		 else
		 {
			 System.out.println("Fail");
		 }

	}

}
