import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
	public static void main(String[] args) {

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("https://demo.guru99.com/test/login.html");

		// Using Select class for selecting value from dropdown

		driver.findElement(By.id("email")).sendKeys("email@test.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.name("SubmitLogin")).click();

		// Close the Browser
		//driver.close();

	}
}
