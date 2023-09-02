package week4.day4;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws Exception {

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Actions action = new Actions(driver);

		WebElement menfashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));

		action.moveToElement(menfashion).perform();

		Thread.sleep(2000);

		menfashion.click();

		driver.findElement(By.xpath("(//span[@class='linkTest'])[1]")).click();

		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();

		System.out.println("Count is " + count);

		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();

		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();

		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();

		List<Integer> sort = new ArrayList<Integer>();

		List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

		for (int i = 0; i < price.size(); i++) {

			String txt = price.get(i).getText();

			String replace = txt.replaceAll("[^0-9]", "");

			int parse = Integer.parseInt(replace);

			sort.add(parse);
		}

		Collections.sort(sort);

		System.out.println("Sorted Value is " + sort);

		Thread.sleep(2000);

		WebElement fromprice = driver.findElement(By.name("fromVal"));

		fromprice.clear();

		fromprice.sendKeys("500");

		Thread.sleep(2000);

		WebElement toprice = driver.findElement(By.name("toVal"));

		toprice.clear();

		toprice.sendKeys("1000");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']")).click();
		
		Thread.sleep(3000);

		String type = driver.findElement(By.xpath("//h1[@class='category-name']")).getText();

		System.out.println("Shoe Type is " + type);

		String sortfilter = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();

		System.out.println("Sorting Type is " + sortfilter);

		String colour = driver.findElement(By.xpath("(//a[@class='clear-filter-pill  '])[1]")).getText();

		System.out.println("Shoe Colour is " + colour);

		Actions action1 = new Actions(driver);

		WebElement firstelement = driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));

		action1.moveToElement(firstelement).perform();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]")).click();

		String shoeprice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();

		System.out.println("Shoe Price is " + shoeprice);

		String disprice = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();

		System.out.println("Discounted Percentage is " + disprice);
		
		SnapDeal scn = new SnapDeal();
		
		scn.takeSnapShot(driver, "C:\\Users\\Thennarasu\\OneDrive\\Desktop\\Screenshot\\1.png");
	}

	public void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(fileWithPath);

		FileUtils.copyFile(SrcFile, DestFile);
	}

}
