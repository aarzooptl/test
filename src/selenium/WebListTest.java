package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//WebElement a = driver.findElement(By.tagName("a"));// Single a element
		
		//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));//gives all links which are on footer
		//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));//gives 3 links which is in this div class
		
		WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a"));//Means gives all a tags which is in this div
		List<WebElement> alllinks = footer.findElements(By.tagName("a"));// List of a elements from left side 

		System.out.println(alllinks.size());
		
		for (int i=1 ;i<alllinks.size();i++)//for loop
		{
			System.out.println(alllinks.get(i).getText());
		}
	}

}
