package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
