package Manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.get("http://www.flipcart.com");
		driver.manage().window().minimize();
		

	}

}
