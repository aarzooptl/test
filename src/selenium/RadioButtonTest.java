package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> allradiosbtn = driver.findElements(By.name("group1"));
		System.out.println(allradiosbtn.size());
		
		for(WebElement a : allradiosbtn)
		{
			System.out.println(a.getAttribute("Value")+"----------"+a.isSelected());
		}
		
		driver.findElement(By.xpath("//input[@value = 'Cheese']")).click();
		
		allradiosbtn.get(2).click();//Index number start from 0
		
		System.out.println("-----------------------");
		for(WebElement a : allradiosbtn)
		{
			System.out.println(a.getAttribute("Value")+"----------"+a.isSelected());
		}
		
	}

}
