package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		Thread.sleep(3000);
		
		//Hover on the men and get all the links like text and size
		WebElement men = driver.findElement(By.linkText("Men"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> alllinks = driver.findElements(By.xpath("(//a[contains(@aria-label, 'main-menu, Men, Shoes')])"));
		System.out.println(alllinks.size());
		
		for(WebElement a : alllinks)
		{
			System.out.println(a.getText());
		}
		
	}

}
