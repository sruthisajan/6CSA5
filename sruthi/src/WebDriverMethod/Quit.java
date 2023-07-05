package WebDriverMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.fb.com");
		URL url= new URL("https://www.amazon.in");
		driver.navigate().to(url);
	}

}
