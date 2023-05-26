package AssignmentMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get1 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
