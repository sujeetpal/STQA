import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFramework {
	WebDriver driver;
	@Test(dataProvider = "testdata")
	public void demoClass(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe"); // Provide the path to

		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().matches("Dashboard - PHPTRAVELS"), "Invalid credentials");
		System.out.println("Login successful");
	}

	@AfterMethod
	void ProgramTermination() {
		driver.quit();
	}

	@DataProvider(name = "testdata")
	public Object[][] testDataExample() {
		ReadExcelFile configuration = new ReadExcelFile("test.xlsx");
		int rows = configuration.getRowCount(0);
		Object[][] signin_credentials = new Object[rows][2];
		for (int i = 0; i < rows; i++) {
			signin_credentials[i][0] = configuration.getData(0, i, 0);
			signin_credentials[i][1] = configuration.getData(0, i, 1);
		}
		return signin_credentials;
	}
}
