package TokensScreenshort;

import java.io.File;
import java.util.Random;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int randomNumber = r.nextInt();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement username = driver.findElement(By.name("login"));
		File source = username.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/screenshot"+randomNumber+".png");
		FileHandler.copy(source,destination);

	}

}
