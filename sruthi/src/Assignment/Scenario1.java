package Assignment;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
		Cookie cooky=new Cookie("selenium","6");
		driver.manage().addCookie(cooky);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
		driver.manage().deleteCookie(cooky);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
		

	}

}
