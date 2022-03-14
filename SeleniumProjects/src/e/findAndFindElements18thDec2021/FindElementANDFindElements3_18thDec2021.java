package e.findAndFindElements18thDec2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementANDFindElements3_18thDec2021 {

	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		List<WebElement> rdx = driver.findElements(By.tagName("a"));
		System.out.println(rdx.size());
		
		for (int i = 0; i < rdx.size(); i++)
		{
			System.out.println(rdx.get(i).getText());
		}
		
		driver.quit();
	
		
	}
}
