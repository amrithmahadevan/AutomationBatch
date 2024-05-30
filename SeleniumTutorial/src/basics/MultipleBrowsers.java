package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserName="Firefox";	//or any as req
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("Chrome")){
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("msedge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://meet.google.com/");
		
	}

}
