package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("lastname")).sendKeys("ddf");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("sdsad");
		
		
		//Select July
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("7");
		
		//Select 19
		WebElement days = driver.findElement(By.id("day"));
		Select day = new Select(days);
		day.selectByValue("19");
		
		//Select 2000
		WebElement years = driver.findElement(By.id("year"));
		Select year = new Select(years);
		year.selectByValue("2000");
		
		List<WebElement> allvalues = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(allvalues.size());
		Thread.sleep(4000);
		
		//Select radio Button
		WebElement sex = driver.findElement(By.xpath("//input[@value='1']"));
		sex.click();
		
		driver.findElement(By.name("websubmit")).click();
		
	}

}
