package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Desktop/dropdown.html");
		WebElement degree=driver.findElement(By.id("degree"));
		Select select=new Select(degree);
		List<WebElement>allSelectedOption=select.getAllSelectedOptions();
		for( WebElement singleOption:allSelectedOption) {
			System.out.println(singleOption.getText());
		
	}

}}
