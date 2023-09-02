package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<Integer> sort = new ArrayList<Integer>();
		
		List<WebElement> pricelist = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for(int i=0;i<pricelist.size();i++) {
		//System.out.println("Price List is "+pricelist.get(i).getText());
		String txt = pricelist.get(i).getText();
		String replace = txt.replaceAll("[^0-9]", "");
		int parse = Integer.parseInt(replace);
		sort.add(parse);
		}
		
		Collections.sort(sort);
		System.out.println("Lowest price is " +sort.get(0));
		

	}

}
