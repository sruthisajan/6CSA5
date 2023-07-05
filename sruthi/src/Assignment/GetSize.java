package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.fb.com");
		Thread.sleep(3000);
		WebElement computerlink =driver.findElement(By.xpath("(//a[text()="));
		System.out.println(computerlink.getSize());
		if(computerlink.getSize() != null) {
			System.out.println("true");
	 {
				System.out.println("unable");
			}
		}}


	}


