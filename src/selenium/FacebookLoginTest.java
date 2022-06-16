package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//Email
		//ClassName - not working
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("dhsds");// when we have space in class name we cannot use it directly
		
		//css selector we do not know css - not working
		//driver.findElement(By.cssSelector(null));//learn syantax
		
		//id - working
		//driver.findElement(By.id("email")).sendKeys("jsdhsd");
		
		//linkText only for links
		//driver.findElement(By.linkText(null));
		
		//name - working
		driver.findElement(By.name("email")).sendKeys("jshds");
		
		//linkText only for links
		//driver.findElement(By.partialLinkText(null));
		
		//tagname - not working as not unique
		//driver.findElement(By.tagName("input")).sendKeys("jdsjf");
		
		//xpath - not working and we do not know xpath
		//driver.findElement(By.xpath(null));
		
		//Password
		driver.findElement(By.name("pass")).sendKeys("dsfsdf");
		
		//login Button
		driver.findElement(By.tagName("button")).click();
	}

}
