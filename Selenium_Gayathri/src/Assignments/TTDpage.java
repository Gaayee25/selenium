package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class TTDpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishnu\\Desktop\\selenium\\workspace\\Selenium_Gayathri\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		//Thread.sleep(5000);
		//implicit wait: page load
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("fName")).sendKeys("Gayathri");
		
	}

}
