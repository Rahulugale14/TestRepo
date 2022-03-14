package d.frameHandling17thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandlingEx2 {																//Nested Frame

public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("name")).sendKeys("Hello");					// Main WebPage
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		WebElement ele = driver.findElement(By.id("course"));				//select path - Bi.id("selectnav1")
		Select s = new Select(ele);
		s.selectByVisibleText("Java");
		Thread.sleep(3000);
		
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();				
		driver.findElement(By.id("name")).sendKeys("frame 3");					// frame 3		
		Thread.sleep(3000);


		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();				
		driver.findElement(By.id("name")).sendKeys("Main WebPage");		// Main WebPage
		Thread.sleep(3000);
		
		driver.quit();

	}
}
