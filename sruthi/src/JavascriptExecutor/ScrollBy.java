package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
	//	jse.executeScript("window.scrollBy(0,500)");
		
		
		for(int i=0;i<=1000;i++)
			jse.executeScript("window.scrollBy(0,2)");
		for(int i=0;i<=1000;i++)
			jse.executeScript("window.scrollBy(0,-2)");
			
	}

}
