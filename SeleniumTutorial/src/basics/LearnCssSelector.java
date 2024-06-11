package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	
		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector("#Email")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("mypassword");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		driver.findElement(By.cssSelector(".list li:nth-child(4) a")).click();
		
		//use this [id*='_EnteredQuantity']
		driver.quit();
	
	}

}
