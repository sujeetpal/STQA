import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwoLocatorStrategy {
	public static void main(String[] args) {

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("https://blazedemo.com/");

		// Using Select class for selecting value from dropdown

		Select dropdown = new Select(driver.findElement(By.name("fromPort")));
		dropdown.selectByVisibleText("Paris");

		driver.findElement(By.className("btn-primary")).click();

		// Close the Browser
		//driver.close();

	}
}
