package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement footer = driver.findElement(By.id("pageFooterChildren"));
		List<WebElement> alllinks = footer.findElements(By.id("a"));
		System.out.println("TOTAL LINKS IN FACEBOOK FOOTER " + alllinks.size());
		
		System.out.println("All the names of footer links");
		for(int i=1;i<=alllinks.size();i++)
		{
		 System.out.println(alllinks.get(i).getText());
		}

	}

}
