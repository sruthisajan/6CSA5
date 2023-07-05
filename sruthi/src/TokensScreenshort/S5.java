package TokensScreenshort;

import java.io.File;
import java.sql.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date; = new Date();
		String todate = date.toString().replace(":","-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement username = driver.findElement(By.name("login"));
		File source = username.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/screenshot"+todate+".png");
		FileHandler.copy(source,destination);
	}

}
