package Assignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UserInputBrowser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter the Browser Name: 1:chrome driver,2:edge browser");
int choice =sc.nextInt();
switch (choice) {
case 1:{
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("hhttps://www.fb.com");
	break;
}
case 2:{
	WebDriver driver= new EdgeDriver();
	break;
}

}
	}

}
