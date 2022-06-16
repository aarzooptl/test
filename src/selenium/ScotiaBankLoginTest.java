package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=7A03lkBnnWA&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiN0EwM2xrQm5uV0EiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYzOTMyODI0OCwiaWF0IjoxNjM5MzI3MDQ4LCJqdGkiOiI0MGJhMzZkZS0xY2JkLTRiMmYtYmUxOS0yZmMzY2MxNGEyNTUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.udBpgJwb7Ev4zAi0G8Pd1toMFHubDksxqFxwLsqDffbNQqQg_vBYyV6Xzj7QsYgPHG0xW0tvXJksQCnrJb7d0BZsRSnsZ-zJhy-Ml_Qzg8Q95slMF4BQGzAhNTEb9v2-hpjy9GZNryyaS9mwaDl4fWTLiYHMRfA8sBvTnWr_fLTy34MwJGcIE_JeYiQGZNu3bNSVIaPpBpnbQ9rT5U7v8AWBVf7Gl_0C0vak2E63vIFw4PeGMCwHiTinK58GJvv_KdgEVsc02TWQztW6xaNjGBvJSqO9ivbPeb2Qh8EN_YS-BfI--IES3ALg5uVctL4IcwmVuk3R0cdXgzBih-dcdA&preferred_environment=");
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("dsfdsf");
		driver.findElement(By.id("password-input")).sendKeys("hdgdf");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(4000);
		
		String expected = "Please check your card number / username or password and try again.";
		String actual = driver.findElement(By.id("globalError")).getText();
		System.out.println(actual);
		
		if(expected.equals(actual))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		}
		
		//we can also use classname as there is no space
		//driver.findElement(By.className("ButtonCore__block")).click();

}
