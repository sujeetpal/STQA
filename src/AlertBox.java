import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class AlertBox {
	public static void main(String[] args) {

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();
		// Switching to Alert
		Alert alert = driver.switchTo().alert();
		// Capturing alert message.
		String alertMessage= driver.switchTo().alert().getText();
		// Displaying alert message
		System.out.println(alertMessage);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Accepting alert
		alert.accept();
		
		// Close the Browser
		//driver.close();

	}
}
