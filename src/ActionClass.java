import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe"); // Provide the path to

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");// locator id
		driver.findElement(By.name("password")).sendKeys("admin123");// locater name
		driver.findElement(By.className("orangehrm-login-button")).click();// locator

		Actions act = new Actions(driver);
		// act.moveToElement(wd.findElement(By.className("firstLevelMenu"))).perform();
		// act.moveToElement(wd.findElement(By.id("menu_recruitment_viewRcruitmentModule"))).perform();
		List<WebElement> menu = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul"));
		for (int i = 0; i <= menu.size() - 1; i++) {
			System.out.println(menu.get(i).getText());// print text ofall the element on console
			act.moveToElement(menu.get(i)).perform();// toperform mousehover on all elements of list
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//driver.findElement(By.partialLinkText("Welcome")).click();// locator partiallinkText
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		driver.findElement(By.linkText("Logout")).click();// locator linkText
	}
}
