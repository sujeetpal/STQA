import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe"); // Provide the path to
																								// your chrome
		// driver. Make sure your chrome
		// driver version is updated.
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		// navigates to the page consisting an iframe
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame("a077aa5e"); //switching the frame by ID
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Switching to iframe");
		driver.findElement(By.xpath("html/body/a/img")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Clicks the iframe
		System.out.println("Finished");

	}
}
