package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/");
		Thread.sleep(10000);

		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement career = driver.findElement(By.linkText("Careers"));
		
		//option 1 - scroll by x and y cordinates untill element is on view
		//System.out.println(career.getLocation());
		//jse.executeScript("window.scrollBy(0,4000)");
		//career.click();
		
		//Option 2 - Scroll until element is in the view is true
		//jse.executeScript("arguments[0].scrollIntoView(true);", career);
		//career.click();
		
		//Option 3 - Direct click using javascript
		jse.executeScript("arguments[0].click();", career);
		

	}

}
