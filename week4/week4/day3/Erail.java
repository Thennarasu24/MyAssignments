package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		
		from.clear();
		
		from.sendKeys("MAS");
		
		Thread.sleep(3000);
		
		from.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		
		to.clear();
		
		to.sendKeys("CBE");
		
		Thread.sleep(3000);
		
		to.sendKeys(Keys.ENTER);
		
		WebElement datesort = driver.findElement(By.id("chkSelectDateOnly"));
		
		datesort.click();
		
		List<WebElement> trainname = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[\"+i+\"]/td[2]/a"));
		
	for(int i=0;i<trainname.size();i++) {
		
		System.out.println(trainname.get(i).getText());
	}
		
			driver.close();	
		
	}

}
