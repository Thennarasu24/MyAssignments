package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/tags/table/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement tablename = driver.findElement(By.xpath("//div[@class='render']/table"));
		
		List<WebElement> rowsize = tablename.findElements(By.tagName("tr"));
		
		List<WebElement> columnsize = tablename.findElements(By.tagName("td"));
		
		System.out.println("Row Size is " +rowsize.size());
		
		System.out.println("Column Size is "+columnsize.size());
		

	}

}
