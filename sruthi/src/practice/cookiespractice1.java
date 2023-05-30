 package practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiespractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.amazon.com");
  Set<Cookie> allcookies = driver.manage().getCookies();
  System.out.println(allcookies.size());
  for (Cookie singlecooky:allcookies)
	System.out.println("singleCooky.getNmame()");
	Cookie cooky=new Cookie("selenium","6");
	driver.manage().addCookie(cooky);
	Set<Cookie> allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for( Cookie singleCooky:allCookies) 
		System.out.println(singleCooky.getName());
  }
  }	  
  

