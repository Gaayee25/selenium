package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmet1 {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishnu\\Desktop\\selenium\\workspace\\Selenium_Gayathri\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com/go-signup/");
		driver.findElement(By.id("firstName")).sendKeys("Gayathri");
		driver.findElement(By.id("lastName")).sendKeys("Jagga");
		driver.findElement(By.name("emailAddress")).sendKeys("gaaye2020@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("0123456789");
		driver.findElement(By.id("password")).sendKeys("abcdefg111");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcdefg111");
		//Dropdown handle
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("UNITED STATES");
		//driver.findElement(By.id("country")).sendKeys("UNITED STATES");
		//driver.findElement(By.name("attendeeType")).sendKeys("Parent");
		driver.findElement(By.id("submit")).click();
	}
}
