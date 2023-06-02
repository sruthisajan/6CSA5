package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {

	

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/chrome/");
			driver.findElement(By.linkText("The Browser by Google"));
			System.out.println("Element 1 Identified");
			
			
			driver.get("https://demowebshop.tricentis.com/computers");
			driver.findElement(By.linkText("Computers"));
			System.out.println("Element 2 Identified");
			
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.linkText("Login"));
			System.out.println("Element 3 Identified");
			
			driver.get("https://www.netflix.com/in/");
			driver.findElement(By.linkText("Sign In"));
			System.out.println("Element 4 Identified");
			
			driver.get("https://www.swiggy.com/");
			driver.findElement(By.linkText("Sign up"));
			System.out.println("Element 5 Identified");
			
			driver.get("https://www.zomato.com/");
			driver.findElement(By.linkText("Add restaurant"));
			System.out.println("Element 6 Identified");
			
			driver.get("https://www.ajio.com/");
			driver.findElement(By.linkText("Customer Care"));
			System.out.println("Element 7 Identified");
			
			driver.get("https://www.eatclub.com/about");
			driver.findElement(By.linkText("About"));
			System.out.println("Element 8 Identified");
			
			driver.get("https://www.google.com/");
			driver.findElement(By.linkText("Gmail"));
			System.out.println("Element 9 Identified");
			
			driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
			driver.findElement(By.linkText("Try for free"));
			System.out.println("Element 10 Identified");
			
			driver.close();
			
			
			
			
			
	}

}
