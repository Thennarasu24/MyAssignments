package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.chittorgarh.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr[\"+i+\"]/td[1]"));
		
		System.out.println("Count of Security Name is "+table.size());
		
		for(int i=0;i<table.size()-1;i++) {
			
			System.out.println(table.get(i).getText());
		}
		
		driver.close();

	}

}
