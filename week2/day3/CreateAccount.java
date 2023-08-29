package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf.org");

		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("10K");

		WebElement ind = driver.findElement(By.name("industryEnumId"));
		Select indenumid = new Select(ind);
		indenumid.selectByIndex(3);
		
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select ownenumid = new Select(owner);
		ownenumid.selectByVisibleText("S-Corporation");

		WebElement sour = driver.findElement(By.name("dataSourceId"));
		Select sourceid = new Select(sour);
		sourceid.selectByValue("LEAD_EMPLOYEE");

		WebElement camp = driver.findElement(By.name("marketingCampaignId"));
		Select marcamid = new Select(camp);
		marcamid.selectByIndex(6);

		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select genstaid = new Select(state);
		genstaid.selectByValue("TX");

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

	}

	}

