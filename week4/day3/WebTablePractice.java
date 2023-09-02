package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTablePractice {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/table.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement table = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table"));
		
		List<WebElement> row = table.findElements(By.tagName("tr"));
		
		List<WebElement> column = table.findElements(By.tagName("th"));
		
		System.out.println("Row Size is " +row.size());
		
		System.out.println("Column size is " +column.size());
	}

}
