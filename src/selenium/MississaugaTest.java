package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.mississauga.ca/");
		Thread.sleep(3000);
		
		//Get size and text under our organization
		WebElement link = driver.findElement(By.xpath("//button[contains(text(),'Our organization')]"));
		link.click();
		
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='dropdown-menu nav-dropdown-menu show'])/li"));
		System.out.println(list.size());
		
		for(WebElement a : list)
		{
			System.out.println(a.getText());
			if(a.getText().equals("Jobs and volunteer"))
			{
				a.click();
				Thread.sleep(1000);
				System.out.println(driver.getTitle());
				break;
			}
		}

	}

}
