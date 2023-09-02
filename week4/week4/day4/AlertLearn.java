package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLearn {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//span[@id='simple_result']")).getText());
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		
		alert.dismiss();
		
		System.out.println(driver.findElement(By.xpath("//span[@id='result']")).getText());
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		
		alert.sendKeys("Thenn");
		
		alert.accept();
		
		System.out.println(driver.findElement(By.xpath("//span[@id='confirm_result']")).getText());
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
		
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		
		System.out.println("All Alerts are handled Successfully");
		
		
		
	}

}
