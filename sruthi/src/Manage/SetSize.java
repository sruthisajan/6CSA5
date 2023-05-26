package Manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class SetSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get( http://www.fb.com);
			Dimension d=new Dimension(550, 550);
		driver.manage().window().setSize(d);

	}

}
