package AssignmentMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get4 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ola.com");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
