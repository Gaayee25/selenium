package webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshotconcept  {

	public static void main(String[] args) throws IOException {
		//systemdate();
		// TODO Auto-generated method stub
		WebDriver driver;
		// Launch the chrome browser);
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("rupsreddy@gmail.com");
		// Take a screenshot

		// path location
		FileInputStream path = new FileInputStream(".\\screenshots\\");
		// take screenshot and it moves to RAM location
		File abd = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// move to customised folder (screenshot path)
		FileHandler.copy(abd, new File(path + "Testing.PNG"));

	}

}
