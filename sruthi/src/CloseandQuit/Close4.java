package CloseandQuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.close();
	}

}
