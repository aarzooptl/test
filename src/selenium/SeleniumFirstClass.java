package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		//Classname objname = new Classname();
		FirefoxDriver driver = new FirefoxDriver();//open browser
		driver.get("https://www.facebook.com/login/");//open facebook
		
		driver.findElement(By.id("email")).sendKeys("dsf");//type wrong email
		driver.findElement(By.id("pass")).sendKeys("dsppf");//type wrong password
		driver.findElement(By.name("login")).click();//click on login button
	}

}
