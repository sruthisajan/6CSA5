package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/minitv/ct/web-series");
		 driver.findElement(By.partialLinkText("Web Series"));
		 System.out.println("element1 identified");
		 
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.partialLinkText("Mobiles"));
		 System.out.println("element2 identified");
		 
		 
		 driver.get("https://www.ajio.com/");
		 driver.findElement(By.partialLinkText("HOME AND KITCHEN"));
		 System.out.println("element3 identified");
		 
		 driver.get("https://www.uber.com/in/en/");
		 driver.findElement(By.partialLinkText("Ride"));
		 System.out.println("element4 identified");
		 
		 driver.get("https://www.youtube.com/");
		 driver.findElement(By.partialLinkText("Home"));
		 System.out.println("element5 identified");
		 
		 driver.get("https://www.lenskart.com/");
		 driver.findElement(By.partialLinkText("COMPUTER GLASSES"));
		 System.out.println("element6 identified");
		 
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.partialLinkText("Create a Page"));
		 System.out.println("element7 identified");

		 driver.get("https://www.ajio.com/");
		 driver.findElement(By.partialLinkText("Mobiles"));
		 System.out.println("element8 identified");

		 driver.get("https://www.ajio.com/");
		 driver.findElement(By.partialLinkText("Mobiles"));
		 System.out.println("element9 identified");

		 driver.get("https://www.ajio.com/");
		 driver.findElement(By.partialLinkText("Mobiles"));
		 System.out.println("element10 identified");

		 driver.close();
	}

}
