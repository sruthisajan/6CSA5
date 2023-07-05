package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText_MSD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/user/Desktop/dropdown.html");
		WebElement beverage = driver.findElement(By.id("beverage"));
		Select select = new Select(beverage);
		Thread.sleep(3000);
		select.selectByVisibleText("COFFEE");
		Thread.sleep(4000);
		select.selectByVisibleText("MILK");

	}

}
