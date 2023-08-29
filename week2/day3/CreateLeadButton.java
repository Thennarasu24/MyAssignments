package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// Pseudo Code

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

		// 8. Enter FirstName using id Locator

		WebElement fstname = driver.findElement(By.id("createLeadForm_firstName"));
		fstname.sendKeys("Thenn");

		// 9. Enter LastName using id Locator

		WebElement lstname = driver.findElement(By.id("createLeadForm_lastName"));
		lstname.sendKeys("Arasu");

		// 10. Enter your mail-id

		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("thennarasu48@gmail.com");

		// 11.phone number

		WebElement phnno = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phnno.sendKeys("9876543210");

		// 12. Click on create Lead Button Using name Locator

		WebElement createleadbtn = driver.findElement(By.name("submitButton"));
		createleadbtn.click();

	}

}
