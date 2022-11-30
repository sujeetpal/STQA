/* Write a Program using Selenium to find an element by xpath */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe"); // Provide the path to your chrome
																					// driver. Make sure your chrome
																					// driver version is updated.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create");
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Your-Name"); // Will send values
																									// to First Name tab
	}
}

// 