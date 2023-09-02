package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Thennarasu");
		
		alert.accept();
		
		WebElement txt = driver.findElement(By.id("confirm_result"));
		
		System.out.println(txt.getText());
		
		

	}

}
