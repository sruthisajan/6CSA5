package LaunchBrawser;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	}
	}


