package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) {
		//create webdriver object
		WebDriver driver;
		
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishnu\\Desktop\\selenium\\workspace\\Selenium_Gayathri\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//type URL
		driver.get("https://www.facebook.com/");
		// UN & PWD
		//Login button click
		driver.findElement(By.id("firstname")).sendKeys("Gayathri");
		//driver.findElement(By.name("websubmit")).
		//driver.findElement(arg0)
		//driver.findElement(By.id("country")).sendKeys("UNITED STATES");
		//driver.findElement(By.name("attendeeType")).sendKeys("Parent");
		//driver.findElement(By.id("submit")).click();

	}

}
