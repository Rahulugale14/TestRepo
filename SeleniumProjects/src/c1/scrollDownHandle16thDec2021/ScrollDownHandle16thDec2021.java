package c1.scrollDownHandle16thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownHandle16thDec2021 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);

		
		WebElement str = driver.findElement(By.xpath("(//li[@id = 'item-7'])[2]")); //// 2nd type this - 17th Dec
		Point loc = str.getLocation();
		System.out.println(loc);
		
	
		JavascriptExecutor js = ((JavascriptExecutor)driver);			// 1st type this - 16th Dec
		js.executeScript("scroll(0, 700)"); 							// vertically down (+value)
		Thread.sleep(3000);
		js.executeScript("scroll(0, -700)");							// vertically up (-value)
		// js.executeScript("window.scrollBy(0, -700)");				// another method
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
