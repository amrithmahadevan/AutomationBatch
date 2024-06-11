package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaBible {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		driver.findElement(By.id("single-input-field")).sendKeys("Yippie");
		driver.findElement(By.id("button-one")).click();
		
		driver.findElement(By.xpath("//*[@id='value-a']")).sendKeys("23");
		driver.findElement(By.xpath("//*[@id='value-b']")).sendKeys("32");
		driver.findElement(By.xpath("//*[@id='button-two']")).click();

	}

}
