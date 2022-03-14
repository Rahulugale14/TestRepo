package moreAndMorePractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class MyProgram {

	public static void main (String [] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://onlineitguru.com/blogger/what-is-meant-by-pega-testing");
		
		driver.findElement(By.xpath("//img[@src = '../storage/course_files/1610111882_Pega testing.png']"));
		// Actions act = new Actions(driver);
		// act.moveToElement(ele).click().build().perform();
		// driver.quit();
	}
}
