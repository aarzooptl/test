package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		List<WebElement> draggable = driver.findElements(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		System.out.println(draggable.size());
		
		if(sortable.size()>0)
		{
			System.out.println("Sortable is Present");
		}
		else
		{
			System.out.println("Sortable id not Present");
		}
		
		driver.switchTo().frame(0);//Switch to frame using index of the frame
		//driver.switchTo().frame("demo-frame");//This option we use only with id or name. In this case we cannot use it.
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));//Using webElement from frame tag
		
		System.out.println("----------------------------Afetr Switching to frame---------------------------");
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if(sortable.size()>0)
		{
			System.out.println("Sortable is Prsent");
		}
		else
		{
			System.out.println("Sortable not present");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		
		System.out.println(draggable.size());
		if(draggable.size()>0)
		{
			System.out.println("draggable is Prsent");
		}
		else
		{
			System.out.println("draggable not present");
		}
		
		System.out.println("----------------------------Switching back to main page---------------------------");
		driver.switchTo().defaultContent();
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if(sortable.size()>0)
		{
			System.out.println("Sortable is Prsent");
		}
		else
		{
			System.out.println("Sortable is not present");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		
		System.out.println(draggable.size());
		if(draggable.size()>0)
		{
			System.out.println("draggable is Prsent");
		}
		else
		{
			System.out.println("draggable is not present");
		}
		
	}

}
