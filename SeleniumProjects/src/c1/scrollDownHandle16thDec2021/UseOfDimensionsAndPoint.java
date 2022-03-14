package c1.scrollDownHandle16thDec2021;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfDimensionsAndPoint {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		
		Dimension d = new Dimension(400,300);
		driver.manage().window().setSize(d);
		Thread.sleep(8000);
		
		Point p = new Point(400,500);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		
		driver.quit();		
		
		
		
		
	}
}
