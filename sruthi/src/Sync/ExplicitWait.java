package Sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)) ;                   
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.name("username"));
driver.findElement(By.name("pwd"));
driver.findElement(By.xpath("/div[text()='Login']")).click();
wait.util(Expectedconditions.visibilityOfElementLocated(By.id("logoutlink")));
driver.findElement(By.id("logoutlink")).click();
driver.close();

	}


