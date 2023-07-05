package Alignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("passContainer"));
		int emailX = email.getRect().x;
		int passX = pass.getRect().x;
		if(emailX==passX)
			System.out.println("left Aligned");
		else
			System.out.println("Not Left Aligned");
		

	}


	}


