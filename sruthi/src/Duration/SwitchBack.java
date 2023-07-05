package Duration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(30)));
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
driver.switchTo().frame(0);
driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
driver.switchTo().defaultContent();
driver.switchTo().frame("packageListFrame");
driver.findElement(By.linkText("AddHasCdp")).click();
	}

}
