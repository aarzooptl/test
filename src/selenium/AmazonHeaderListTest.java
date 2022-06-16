package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));//single line code
		
		System.out.println(alllinks.size());
		
		for(int i=1;i<=alllinks.size();i++)
		{
			System.out.println(alllinks.get(i).getText());
		}
	}

}
