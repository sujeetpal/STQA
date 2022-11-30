
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe"); // Provide the path to
																								// your chrome
		// driver. Make sure your chrome
		// driver version is updated.
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.learningaboutelectronics.com/Articles/How-to-create-a-list-box-in-HTML.php");

		Select s = new Select(driver.findElement(By.name("credit_card")));
		if (s.isMultiple()) {
			s.selectByIndex(1);
			s.selectByValue("2");
			s.selectByVisibleText("Visa");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// s.deselectByIndex(1);
			s.deselectAll();
		} else {
			s.selectByIndex(1);
		}

	}
}
