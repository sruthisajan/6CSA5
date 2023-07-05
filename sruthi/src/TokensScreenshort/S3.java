package TokensScreenshort;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement password = driver.findElement(By.id("pass"));
		File source = password.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/screenshot1.png");
		FileHandler.copy(source,destination);

	}

}
