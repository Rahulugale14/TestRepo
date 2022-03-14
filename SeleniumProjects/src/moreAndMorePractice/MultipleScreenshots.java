package moreAndMorePractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultipleScreenshots {

	public static void main (String [] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		MultipleScreenshots.newScreenshot(driver, "FirstPage");
		
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("The Secret");
		driver.findElement(By.xpath("(//input[@class = 'nav-input nav-progressive-attribute'])[2]")).click();
		MultipleScreenshots.newScreenshot(driver, "SecondPage");

		
		
	}

	public static void newScreenshot(WebDriver driver, String name) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumProjects\\src\\moreAndMorePractice\\" + name + ".png");
	FileHandler.copy(src, des);
	
	// driver.quit();
	}

}
