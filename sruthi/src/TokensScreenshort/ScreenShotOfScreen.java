package TokensScreenshort;

import java.io.File;
import java.sql.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String todate = date.toString().replace(":","-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File destination = new File("./screenshots/screenshot"+todate+".png");
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source,destination);
		driver.close();
	}

}
