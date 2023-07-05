package Alignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		int userX = username.getRect().x;
		int passX = password.getRect().x;
		int userWidth = username.getRect().width;
		int passWidth = password.getRect().width;
		if(userX+userWidth==passX+passWidth)
			System.out.println("Right Aligned");
		else
			System.out.println("Not Right Aligned");

	}

}
