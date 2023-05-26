package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SplitBrowser {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http:/ www.amazon.com");
		Dimension d =new Dimension(750,800);
		driver.manage().window().setSize(d);
		WebDriver driver1= new EdgeDriver();
		driver1 .get("http:/www.youtube.com");
		Dimension d1 =new Dimension(750, 800);
		driver1.manage().window().setSize(d1);
		Point p=new Point(750,10);
		driver1.manage().window().setPosition(p);



	}

}
