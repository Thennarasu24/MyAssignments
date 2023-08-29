package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement createnewacct = driver.findElement(By.partialLinkText("open-registration-form-button"));
		
		createnewacct.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		firstname.sendKeys("Thennarasu");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		
		lastname.sendKeys("S");
		
		WebElement mobile = driver.findElement(By.id("u_9_g_ML"));
		
		mobile.sendKeys("9944535084");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		
		password.sendKeys("abcdefghij");
		
		WebElement drpdwndate = driver.findElement(By.name("birthday_day"));
		
		Select date = new Select(drpdwndate);
		
		date.selectByValue("24");
		
		WebElement drpdwnmonth = driver.findElement(By.name("birthday_month"));
		
		Select month = new Select(drpdwnmonth);
		
		month.selectByIndex(7);
		
		WebElement drpdwnyear = driver.findElement(By.name("birthday_year"));
		
		Select year = new Select(drpdwnyear);
		
		year.selectByVisibleText("1993");
		
		WebElement gender = driver.findElement(By.className("_58mt"));
		
		gender.click();
		
	}

}
