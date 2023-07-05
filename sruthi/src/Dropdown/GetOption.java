package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("file:///C:/Users/user/Desktop/dropdown.html");
WebElement city=driver.findElement(By.id("city"));
Select select=new Select(city);
List<WebElement>allOption=select.getOptions();
for(WebElement singleOption:allOption) {
if(singleOption.getText().equals("DHAKA")) {
	singleOption.click();
	break;
}
else
	System.out.println("option not available");
	}

}}
