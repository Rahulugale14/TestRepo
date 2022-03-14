package d.frameHandling17thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling17thDec2021 {

public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");    // if not typed, shows exception
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");		// what if no https? shows invalid argument exception
		Thread.sleep(3000);

		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id = 'a']")).click();
		Thread.sleep(3000);

		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input")).sendKeys("Selenium Frame Handling");
		Thread.sleep(3000);

		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame2");
		WebElement ele = driver.findElement(By.xpath("//select[@id = 'animals']"));
		Select s = new Select(ele);
		s.selectByVisibleText("Big Baby Cat");
		Thread.sleep(3000);

		driver.quit();
		
		
	}
}
