package AssignmentMethod;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sc.nextInt;

public class UserInputBrowser {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Browser name");
	Object n=new sc.nextInt();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.fb.com");
}
}
