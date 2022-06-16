package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://pages.ebay.ca/sitemap.html");
		
		WebElement search = driver.findElement(By.id("gh-ac"));
		search.sendKeys("iphone");//Type iPhone
		Thread.sleep(2000);
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@id='gAC']/ul/li")); 
		System.out.println(alllinks.size());
		
		for(WebElement a : alllinks )
		{
			System.out.println(a.getText());
		}
		
	}

}
