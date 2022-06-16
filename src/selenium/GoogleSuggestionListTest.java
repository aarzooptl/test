package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("canada");
		Thread.sleep(2000);
		
		List<WebElement> alllinks = driver.findElements(By.xpath("(//ul[@role='listbox'])/li"));
		System.out.println(alllinks.size());
		
		for(int i=1;i<=alllinks.size();i++)
		{	
			
			System.out.println(alllinks.get(i).getText());
		}
		
	}

}
