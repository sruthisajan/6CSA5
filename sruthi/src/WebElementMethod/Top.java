package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Top {

	

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
Thread.sleep(4000);
WebElement username = driver.findElement(By.name("username"));
WebElement password = driver.findElement(By.name("password"));
int userY = username.getRect().Y;
int userHeight = username.getRect().height;
int passY = password.getRect().y;
if(passY>userY+userHeight)
	System.out.println("Top Aligned");
else
	System.out.println("Not Top Aligned");

	}

}
