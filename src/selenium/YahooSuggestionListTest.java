package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.name("p"));
		search.sendKeys("canada");
		
		Thread.sleep(3000);
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(alllinks.size());
		
		for(WebElement a : alllinks)
		{
			System.out.println(a.getText());
		}
		
	}

}
