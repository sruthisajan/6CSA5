package Manage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		Point value =driver.manage().window().getPosition();
		System.out.println(value);
		
		
		

	}

}
