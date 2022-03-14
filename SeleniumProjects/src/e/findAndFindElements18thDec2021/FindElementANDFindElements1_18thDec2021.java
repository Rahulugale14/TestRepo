package e.findAndFindElements18thDec2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementANDFindElements1_18thDec2021 {
	
	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> rdx = driver.findElements(By.tagName("a"));
		System.out.println(rdx.size());
		
		driver.quit();
		
	}
	
}
