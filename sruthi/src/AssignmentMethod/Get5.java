package AssignmentMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get5 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.meesho.com");
		String title = driver.getTitle();
		System.out.println(title);
	}	
}
