package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ElementPresentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//Using webelement we cannot verify if element is present or not.
		
		driver.get("https://www.google.com/");
		//if(driver.findElement(By.linkText("About")).isDisplayed())
		//{
			//System.out.println("Element is Present");
		//}
		//else
		//{
			//System.out.println("ElemWebElement Present");
		//}
		
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size()>0)
		{
			System.out.println("Element is Present");
		}
		else
		{
			System.out.println("ElemWebElement Present");
		}
	}

}
