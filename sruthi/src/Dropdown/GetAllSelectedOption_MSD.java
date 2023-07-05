package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption_MSD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/user/Desktop/dropdown.html");
		WebElement beverage=driver.findElement(By.id("beverage"));
		Select select=new Select(beverage);
		select.selectByIndex(0);
		select.selectByIndex(3);
		List<WebElement>allSelectedOption=select.getAllSelectedOptions();
		for( WebElement singleOption:allSelectedOption) {
			System.out.println(singleOption.getText());
		
	}
	}

}
