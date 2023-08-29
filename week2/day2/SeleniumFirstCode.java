package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstCode {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		// finding element
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("PASSWORD"));
		WebElement loginbtn = driver.findElement(By.className("decorativeSubmit"));

		// sending user name & password
		username.sendKeys("Demosalesmanager");

		password.sendKeys("crmsfa");

		// clicking submit button
		loginbtn.click();
		
        //Get Title of the page
        String title = driver.getTitle();
        //print the title
        System.out.println(title);
        //click crmsfa
        driver.findElement(By.linkText("CRM/SFA")).click();
        //Click Lead
        driver.findElement(By.linkText("Leads")).click();
        //click createlead
        driver.findElement(By.linkText("Create Lead")).click();
        //Enter Company name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf123");
        //Enter first name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thennarasu");
        //Enterlastname
        
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
        
        //click CreateLead
        
        driver.findElement(By.name("submitButton")).click();
        
        //Verify the text
        String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        //print the text
        System.out.println(text);

		// Closing the opened browser
		//driver.close();

	}

}
