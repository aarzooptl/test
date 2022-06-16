package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE);//This is for Firefox, chrodriver or any class driver
		FileUtils.copyFile(scrFile, new File("C:/testing/screenshot.png"));//Path for screenshot in which folder you want

	}

}
