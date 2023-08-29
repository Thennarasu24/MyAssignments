package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		
		driver.findElement(By.className("rilrtl-button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(3000);
			
		WebElement count = driver.findElement(By.xpath("//div[@class='length']"));
		
		String cnt = count.getText();
		
		System.out.println("Count is "+cnt);

		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		
		System.out.println("Brand name is " );
		
		for(int i =0;i<brand.size();i++) {
			
			System.out.println(brand.get(i).getText());
			
		}
		
		System.out.println("\n");
		
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		System.out.println("Bag name is " );
		
		for(int j =0;j<name.size();j++) {
			
			System.out.println(name.get(j).getText());
		}
		
		driver.close();
	}

}
