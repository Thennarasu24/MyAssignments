package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValidation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		// 2. Enter UserName and Password Using Id Locator

		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));

		username.sendKeys("Demosalesmanager");
		password.sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		WebElement lgnbtn = driver.findElement(By.className("decorativeSubmit"));

		lgnbtn.click();

		// 4. Click on CRM/SFA Link

		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();

		// 5. Click on Leads Button

		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();

		// 6. Click on create Lead Button
		WebElement createleads = driver.findElement(By.linkText("Create Lead"));
		createleads.click();

		// 7. Enter CompanyName using id Locator

		WebElement cmpnyname = driver.findElement(By.id("createLeadForm_companyName"));
		cmpnyname.sendKeys("TestLeaf");

		// 8. Enter the mandatory fields

		WebElement fstname = driver.findElement(By.id("createLeadForm_firstName"));
		fstname.sendKeys("Thenn");

		WebElement lstname = driver.findElement(By.id("createLeadForm_lastName"));
		lstname.sendKeys("Arasu");

		// 9. Select Employee in source dropdown using index

		WebElement drpdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedrpdown = new Select(drpdown);
		sourcedrpdown.selectByIndex(4);

		// 10. Select Automobile in MarketCampaign using visibletext

		WebElement drdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select atmdrpdown = new Select(drdown);
		atmdrpdown.selectByVisibleText("Automobile");

		// 11. Select Corporation in Ownership using value

		WebElement dropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owndrpdown = new Select(dropdown);
		owndrpdown.selectByValue("OWN_CCORP");

		// 12. Click Create

		WebElement create = driver.findElement(By.name("submitButton"));
		create.click();

		// 13. Verify the title

		String title = driver.getTitle();
		{
			System.out.println(title);
		}
		
		driver.close();

	}

}
