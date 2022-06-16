package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://ca.yahoo.com/");

	WebElement header = driver.findElement(By.xpath("//div[@class='c-list Mb(24px) wafer-tabs-target_Mb(18px) D(b)']"));
	List<WebElement> alllinks = header.findElements(By.tagName("a"));
	System.out.println(alllinks.size());
	
	for(int i=1;i<=alllinks.size();i++)
	{
		System.out.println(alllinks.get(i).getText());
	}
	}

}
