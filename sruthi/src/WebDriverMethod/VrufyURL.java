package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VrufyURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		if(actualURL.equals(expectedURL))
			System.out.println("PASS");
		else
			System.out.println("FAIL");
	}

}
