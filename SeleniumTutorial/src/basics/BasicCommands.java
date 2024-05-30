package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		//Ctrl+Shift+o
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();		//will open chrome browser and maximize it
		
		driver.get("https://www.flipkart.com/");	//will open the url
		
		//to grabTitle of page
		// String title= driver.getTitle();
		// System.out.println(title);
		
		//to navigate in forward direction
		// driver.navigate().back();
		
		//to navigate in backward direction
		// driver.navigate().forward();
		
		//to close current window
		//driver.close();
		
		//to close the entire browser
		driver.quit();
	}

}
