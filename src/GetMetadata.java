import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetMetadata {
	public static void main(String[] args) {

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialkart.com/");
        String title = driver.getTitle();
        System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		// Close the Browser
		//driver.close();

	}
}
