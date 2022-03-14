package e.findAndFindElements18thDec2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_FindElements18thDec2021 {

	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// driver.get("file://C:/Users/admin/Desktop/myWebsite.html");
		
		
		
		// Difference between findElement & findElements:-
		
		/*
		driver.findElement(By.name("bhfdsafj")).click();
		
		List<WebElement> list = driver.findElements(By.name("bhfdsafj"));
		System.out.println(list.size());
		*/
		

		
		
	}
	
}
