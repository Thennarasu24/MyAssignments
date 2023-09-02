package week4.day4;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("One Plus 9 pro");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println("Price of first product is "+driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='a-size-small a-color-base a-text-normal'])[1]")).click();
		
		Thread.sleep(3000);
		
		String price = driver.findElement(By.xpath("//span[@class='a-size-mini cm-cr-review-stars-text-sm']")).getText();
		
		System.out.println("Customer rating for First product is "+price);
		
		Thread.sleep(3000);
		
		Amazon amzn = new Amazon();
		
		amzn.takeSnapShot(driver, "C:\\Users\\Thennarasu\\OneDrive\\Desktop\\Screenshot\\2.png");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		driver.findElement(By.xpath("//button[@id='a-autoid-0-announce']")).click();
		
		Thread.sleep(2000);
		
		String subtotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
		if(price.equals(subtotal)) {
			
			System.out.println("Price is matching");
		}
		
		else {
			
			System.out.println("Price not matching");
		}
		
		
	}

	public void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(fileWithPath);

		FileUtils.copyFile(SrcFile, DestFile);
	}
}
