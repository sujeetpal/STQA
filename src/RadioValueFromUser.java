import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner; 

public class RadioValueFromUser {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Yes/No");

	    String userVal = myObj.nextLine(); 
	    
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe"); // Provide the path to
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		WebElement l=driver.findElement(By.cssSelector("input[value='"+userVal+"']"));
		l.click();
	}
}
